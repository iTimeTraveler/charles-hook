mkdir build && cd build

charles_app=Charles451_release/Charles.app
origin_chlsjar=Charles451_release/Charles.app/Contents/Java/charles.jar
ja_file=libs/javassist.jar

cp $origin_chlsjar build/
cp -rf $charles_app build/

temp_chlsjar=build/charles.jar

# 1. 编译新增的插件类，添加进charles.jar
javac -d ./ -classpath $origin_chlsjar src/main/java/*.java
jar -uvf $temp_chlsjar com/xk72/charles/*

# 2. 用 javassist 修改charles.jar
javac -d build/ -classpath $ja_file src/HookUtil.java
java -classpath build/:$ja_file HookUtil

# 3. 替换Charles.app中的charles.jar文件, 同时添加编译好的新插件类
jar -uvf $temp_chlsjar com/xk72/charles/*

cp build/charles.jar build/Charles.app/Contents/Java/

rm -rf com