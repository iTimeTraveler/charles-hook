#!/bin/bash -eu

proxy=127.0.0.1:8888
specified_proxy=0

while getopts ":p:" opt; do
	case $opt in
    	p)
	      	proxy="$OPTARG"
	      	specified_proxy=1
	      	;;
    	\?)
	      	echo "Invalid option: -$OPTARG" >&2
	      	;;
	esac
done

shift $((OPTIND-1))

echo
echo "############################################"
echo "Charles Root Certificate Java VM Import Tool"
echo "############################################"
echo
echo "This tool imports your Charles Root Certificate into the Java VMs that it finds on"
echo "your computer, so that Java applications trust your Charles Root Certificate for"
echo "SSL Proxying."
echo

echo "Connecting to Charles: $proxy"
cert_file=$(mktemp -t charles-ca-cert)

set +e
curl -s http://ssl.charles/ --proxy "$proxy" > "$cert_file"
curl_result=$?
set -e

if [ $curl_result != 0 ]; then
	echo "Failed to connect to Charles on $proxy"
	
	if [ $specified_proxy == 1 ]; then
		exit 1
	fi
	
	read -e -p "What port is configured for HTTP proxy in Charles? " proxy_port
	if [ "x$proxy_port" == "x" ]; then
		exit 1
	fi
	proxy="127.0.0.1:$proxy_port"
	
	set +e
	curl -s http://ssl.charles/ --proxy "$proxy" > "$cert_file"
	curl_result=$?
	set -e
	
	if [ $curl_result != 0 ]; then
		echo "Failed to connect to Charles on $proxy"
		read -e -p "Press return to exit. " dummy
		exit 1
	fi
fi

echo

install_ca() {
	echo "$1"
	echo "** This may require your password in order to use sudo to import the certificate **"

	sudo keytool -import -noprompt -alias charles-$(date +%Y%m%d%H%M%S) -file "$cert_file" -keystore "$1" -storepass changeit
	echo
}

if [ "x${1:-}" != "x" ]; then
	if [ ! -d "$1" ]; then
		echo "Couldn't find directory: $1"
		exit 1
	fi
	if [ ! -d "$1/jre" ]; then
		echo "The Java VM directory should contain a jre directory, but didn't: $1"
		exit 1
	fi
	if [ ! -f "$1/jre/lib/security/cacerts" ]; then
		echo "The Java VM directory should contain a cacerts file at jre/lib/security/cacerts, but didn't: $1"
		exit 1
	fi
	install_ca "$1/jre/lib/security/cacerts"
	exit 0
fi

if [ -z "${JAVA_HOME:-}" ]; then
	echo "JAVA_HOME environment variable not found. Not patching any JDK."
else
	if [ ! -f "$JAVA_HOME"/jre/lib/security/cacerts ]; then
		echo "Could not find cacerts file: $JAVA_HOME/jre/lib/security/cacerts"
	else 
		echo "Found JDK: $JAVA_HOME"
		echo "Adding Charles SSL CA certificate to JDK cacerts file:"
		install_ca "$JAVA_HOME"/jre/lib/security/cacerts
	fi
fi

JAVA_APPLET_PLUGIN_CACERTS=/Library/Internet\ Plug-Ins/JavaAppletPlugin.plugin/Contents/Home/lib/security/cacerts

if [ -f "$JAVA_APPLET_PLUGIN_CACERTS" ]; then
	echo "Found JavaAppletPlugin"
	echo "Adding Charles SSL CA certificate to JavaAppletPlugin cacerts file:"
	install_ca "$JAVA_APPLET_PLUGIN_CACERTS"
fi

rm -f "$cert_file"

echo "Complete"
read -e -p "Press return to exit. " dummy
