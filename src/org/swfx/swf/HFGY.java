// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;
import org.swfx.MwBy.vTyh;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import com.xk72.util.AEvV;
import java.io.IOException;
import com.xk72.util.EmeJ;
import java.io.InputStream;
import com.xk72.amf.foWu;

public final class HFGY implements foWu
{
    private int qaiR;
    private int BKlK;
    private komX BDVX;
    private int nCjh;
    private int lkrI;
    private boolean YcyC;
    
    public static boolean tEdg(final InputStream inputStream) {
        if (inputStream == null) {
            return false;
        }
        final byte[] array = new byte[3];
        EmeJ.tEdg(inputStream, array);
        return tEdg(array);
    }
    
    private static boolean tEdg(final byte[] array) {
        return (array[0] == 67 || array[0] == 70) && array[1] == 87 && array[2] == 83;
    }
    
    public final org.swfx.MwBy.foWu TryJ(final InputStream in) {
        final byte[] b = new byte[3];
        in.read(b, 0, 3);
        if (!tEdg(b)) {
            throw new IOException("Not a SWF");
        }
        this.YcyC = (b[0] == 67);
        org.swfx.MwBy.foWu foWu = new org.swfx.MwBy.foWu(in);
        this.qaiR = foWu.aqrV();
        this.BKlK = foWu.NCuT();
        if (this.YcyC) {
            foWu = new org.swfx.MwBy.foWu(new InflaterInputStream(in, new AEvV()));
        }
        (this.BDVX = new komX()).tEdg(foWu);
        this.nCjh = foWu.RjRQ();
        this.lkrI = foWu.RjRQ();
        return foWu;
    }
    
    private void tEdg(final kQqI kQqI) {
    }
    
    private int LrxC() {
        return 12 + this.BDVX.tEdg();
    }
    
    public final int tEdg() {
        return this.qaiR;
    }
    
    private void tEdg(final int qaiR) {
        this.qaiR = qaiR;
    }
    
    public final int TryJ() {
        return this.BKlK;
    }
    
    private void TryJ(final int bKlK) {
        this.BKlK = bKlK;
    }
    
    public final komX NCuT() {
        return this.BDVX;
    }
    
    private void tEdg(final komX bdvx) {
        this.BDVX = bdvx;
    }
    
    private int Ffoi() {
        return this.nCjh;
    }
    
    private void NCuT(final int nCjh) {
        this.nCjh = nCjh;
    }
    
    public final int Rarr() {
        return this.nCjh >> 8;
    }
    
    private void Rarr(final int n) {
        this.nCjh = n << 8;
    }
    
    public final int RjRQ() {
        return this.lkrI;
    }
    
    private void RjRQ(final int lkrI) {
        this.lkrI = lkrI;
    }
    
    public final boolean aqrV() {
        return this.YcyC;
    }
    
    private void tEdg(final boolean ycyC) {
        this.YcyC = ycyC;
    }
}
