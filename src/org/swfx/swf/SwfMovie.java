// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;
import org.swfx.MwBy.foWu;
import java.io.InputStream;
import java.io.FileInputStream;

public class SwfMovie
{
    private HFGY tEdg;
    private LOtr TryJ;
    private fVcP NCuT;
    private hFso Rarr;
    
    public static void main(final String[] t) {
        final SwfMovie swfMovie = new SwfMovie();
        final FileInputStream fileInputStream = new FileInputStream("/Users/karlvr/Desktop/main.swf");
        try {
            swfMovie.tEdg(fileInputStream);
            fileInputStream.close();
        }
        catch (Throwable t) {
            try {
                fileInputStream.close();
            }
            catch (Throwable exception) {
                t.addSuppressed(exception);
            }
            throw t;
        }
    }
    
    public SwfMovie() {
        this(new UrWX());
    }
    
    private SwfMovie(final hFso rarr) {
        this.tEdg = null;
        this.NCuT = new fVcP();
        this.Rarr = rarr;
    }
    
    public final void tEdg(final InputStream inputStream) {
        final foWu tryJ = this.TryJ(inputStream);
        (this.TryJ = new LOtr()).tEdg(this);
        this.TryJ.tEdg(tryJ);
    }
    
    private void tEdg(final kQqI kQqI) {
    }
    
    private foWu TryJ(final InputStream inputStream) {
        this.tEdg = new HFGY();
        return this.tEdg.TryJ(inputStream);
    }
    
    private iAhS tEdg(final int n) {
        return this.NCuT.tEdg(n);
    }
    
    private HFGY NCuT() {
        return this.tEdg;
    }
    
    public final LOtr tEdg() {
        return this.TryJ;
    }
    
    private static boolean Rarr() {
        return true;
    }
    
    private void tEdg(final HFGY tEdg) {
        this.tEdg = tEdg;
    }
    
    private void tEdg(final LOtr tryJ) {
        (this.TryJ = tryJ).tEdg(this);
    }
    
    private fVcP RjRQ() {
        return this.NCuT;
    }
    
    private void tEdg(final fVcP nCuT) {
        this.NCuT = nCuT;
    }
    
    public final hFso TryJ() {
        return this.Rarr;
    }
    
    private void tEdg(final hFso rarr) {
        this.Rarr = rarr;
    }
    
    private static void aqrV() {
    }
}
