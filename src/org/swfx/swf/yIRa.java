// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;
import org.swfx.MwBy.foWu;

public class yIRa extends vTyh
{
    private int qaiR;
    private boolean BKlK;
    private boolean BDVX;
    private boolean nCjh;
    private boolean lkrI;
    private boolean YcyC;
    private boolean lTrO;
    private boolean wBEN;
    private boolean ONYj;
    private String HZdz;
    private int ADHf;
    private char[] Edaz;
    private int RvOR;
    private int CmsI;
    private int RkIp;
    private int BSCx;
    private int[] LUIL;
    private int[] xnye;
    private int[] GMip;
    
    public yIRa() {
        super(48);
    }
    
    public final String NCuT() {
        if (this.ONYj && this.wBEN) {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.HZdz);
        }
        if (this.ONYj) {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.HZdz);
        }
        if (this.wBEN) {
            return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, this.HZdz);
        }
        return this.HZdz;
    }
    
    public final String Rarr() {
        if (this.ONYj && this.wBEN) {
            return "Bold Italic";
        }
        if (this.ONYj) {
            return "Bold";
        }
        if (this.wBEN) {
            return "Italic";
        }
        return "Plain";
    }
    
    public final String RjRQ() {
        final StringBuffer sb = new StringBuffer();
        if (this.BKlK) {
            sb.append("Has Layout, ");
        }
        if (this.BDVX) {
            sb.append("ShiftJIS, ");
        }
        if (this.nCjh) {
            sb.append("Small, ");
        }
        if (this.lkrI) {
            sb.append("ANSI, ");
        }
        final String trim;
        if ((trim = sb.toString().trim()).length() > 0) {
            return trim.substring(0, trim.length() - 1);
        }
        return null;
    }
    
    @Override
    protected final void TryJ(final org.swfx.MwBy.foWu foWu) {
        this.BKlK = foWu.LrxC();
        this.BDVX = foWu.LrxC();
        this.nCjh = foWu.LrxC();
        this.lkrI = foWu.LrxC();
        this.YcyC = foWu.LrxC();
        this.lTrO = foWu.LrxC();
        this.wBEN = foWu.LrxC();
        this.ONYj = foWu.LrxC();
        this.qaiR = foWu.aqrV();
        this.HZdz = foWu.Ffoi();
        this.ADHf = foWu.RjRQ();
        final int[] array = new int[this.ADHf + 1];
        for (int i = 0; i <= this.ADHf; ++i) {
            array[i] = (this.YcyC ? foWu.NCuT() : foWu.RjRQ());
        }
        foWu.tEdg(array[this.ADHf] - (this.ADHf + 1) * (this.YcyC ? 4 : 2));
        this.Edaz = new char[this.ADHf];
        for (int j = 0; j < this.ADHf; ++j) {
            this.Edaz[j] = (char)(this.lTrO ? foWu.RjRQ() : foWu.aqrV());
        }
        if (this.BKlK) {
            this.RvOR = foWu.Rarr();
            this.CmsI = foWu.Rarr();
            this.RkIp = foWu.Rarr();
            for (int k = 0; k < this.ADHf; ++k) {
                foWu.Rarr();
            }
            for (int l = 0; l < this.ADHf; ++l) {
                new komX().tEdg(foWu);
            }
            this.BSCx = foWu.Rarr();
            this.LUIL = new int[this.BSCx];
            this.xnye = new int[this.BSCx];
            this.GMip = new int[this.BSCx];
            for (int n = 0; n < this.BSCx; ++n) {
                this.LUIL[n] = (this.lTrO ? foWu.RjRQ() : foWu.aqrV());
                this.xnye[n] = (this.lTrO ? foWu.RjRQ() : foWu.aqrV());
                this.GMip[n] = foWu.Rarr();
            }
        }
    }
    
    @Override
    public final void tEdg(final kQqI kQqI) {
    }
    
    private boolean mvCd() {
        return this.ONYj;
    }
    
    private boolean Xygi() {
        return this.wBEN;
    }
    
    public final String aqrV() {
        return this.HZdz;
    }
    
    public final int LrxC() {
        return this.ADHf;
    }
    
    private void tEdg(final int adHf) {
        this.ADHf = adHf;
    }
    
    public final char[] Ffoi() {
        return this.Edaz;
    }
    
    private int bsDo() {
        return this.RvOR;
    }
    
    private int HwpX() {
        return this.CmsI;
    }
    
    private int Ntkc() {
        return this.RkIp;
    }
    
    private int[] dbSi() {
        return this.LUIL;
    }
    
    private int[] Brvb() {
        return this.xnye;
    }
    
    public final int[] MnsE() {
        return this.GMip;
    }
    
    private void tEdg(final boolean onYj) {
        this.ONYj = onYj;
    }
    
    private void TryJ(final boolean wben) {
        this.wBEN = wben;
    }
    
    private boolean xgCJ() {
        return this.BKlK;
    }
    
    private void NCuT(final boolean bKlK) {
        this.BKlK = bKlK;
    }
    
    private void tEdg(final String hZdz) {
        this.HZdz = hZdz;
    }
    
    private void tEdg(final char[] edaz) {
        this.Edaz = edaz;
    }
    
    private void TryJ(final int cmsI) {
        this.CmsI = cmsI;
    }
    
    private void NCuT(final int rvOR) {
        this.RvOR = rvOR;
    }
    
    private void Rarr(final int rkIp) {
        this.RkIp = rkIp;
    }
    
    private boolean qNNf() {
        return this.nCjh;
    }
    
    private void Rarr(final boolean nCjh) {
        this.nCjh = nCjh;
    }
    
    private boolean RcgS() {
        return this.BDVX;
    }
    
    private void RjRQ(final boolean bdvx) {
        this.BDVX = bdvx;
    }
    
    private boolean RbzZ() {
        return this.lkrI;
    }
    
    private void aqrV(final boolean lkrI) {
        this.lkrI = lkrI;
    }
    
    private Integer xceb() {
        return this.tEdg();
    }
}
