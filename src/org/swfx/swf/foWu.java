// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;

public abstract class foWu implements com.xk72.amf.foWu
{
    private LOtr qaiR;
    private int BKlK;
    private int BDVX;
    
    public foWu(final int bKlK) {
        this.BKlK = bKlK;
    }
    
    public final void tEdg(final org.swfx.MwBy.foWu foWu, final int bKlK, final int bdvx) {
        this.BKlK = bKlK;
        this.BDVX = bdvx;
        this.tEdg(foWu);
    }
    
    private void TryJ(final org.swfx.MwBy.foWu foWu) {
        this.tEdg(foWu);
    }
    
    public abstract void tEdg(final org.swfx.MwBy.foWu p0);
    
    private LOtr NCuT() {
        return this.qaiR;
    }
    
    public final void tEdg(final LOtr qaiR) {
        this.qaiR = qaiR;
    }
    
    public abstract void tEdg(final kQqI p0);
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;, this.BKlK, this.BDVX, super.toString());
    }
    
    private int Rarr() {
        return this.BKlK;
    }
    
    private void tEdg(final int bKlK) {
        this.BKlK = bKlK;
    }
    
    public final int TryJ() {
        return this.BDVX;
    }
    
    private void TryJ(final int bdvx) {
        this.BDVX = bdvx;
    }
}
