// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.aZWr;

import org.swfx.aZWr.aZWr.vTyh;

public final class kQqI
{
    private static int tEdg = 8;
    private static int TryJ = 9;
    private static int NCuT = 18;
    private static int Rarr = 2;
    private static int RjRQ = 3;
    private static int aqrV = 4;
    private static int LrxC = 5;
    private static int Ffoi = 6;
    private int MnsE;
    private int mvCd;
    private int Xygi;
    private int bsDo;
    private int HwpX;
    private byte[] Ntkc;
    
    public final void tEdg(final vTyh vTyh) {
        this.MnsE = vTyh.aqrV();
        this.mvCd = vTyh.TryJ(24);
        this.Xygi = vTyh.TryJ(24);
        vTyh.NCuT();
        if (this.MnsE == 9) {
            this.HwpX = vTyh.TryJ(4);
            this.bsDo = vTyh.TryJ(4);
            vTyh.tEdg(this.mvCd - 1);
            return;
        }
        if (this.MnsE == 18) {
            vTyh.read(this.Ntkc = new byte[this.mvCd], 0, this.mvCd);
            return;
        }
        vTyh.tEdg(this.mvCd);
    }
    
    public final int tEdg() {
        return this.MnsE;
    }
    
    private int RjRQ() {
        return this.mvCd;
    }
    
    public final int TryJ() {
        return this.Xygi;
    }
    
    private void tEdg(final int mnsE) {
        this.MnsE = mnsE;
    }
    
    private void TryJ(final int xygi) {
        this.Xygi = xygi;
    }
    
    private int aqrV() {
        return 11 + this.mvCd;
    }
    
    public final int NCuT() {
        return this.bsDo;
    }
    
    private void NCuT(final int bsDo) {
        this.bsDo = bsDo;
    }
    
    private int LrxC() {
        return this.HwpX;
    }
    
    private void Rarr(final int hwpX) {
        this.HwpX = hwpX;
    }
    
    public final byte[] Rarr() {
        return this.Ntkc;
    }
    
    private void tEdg(final byte[] ntkc) {
        this.Ntkc = ntkc;
    }
}
