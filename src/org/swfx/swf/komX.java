// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.charles.gui.transaction.viewers.protobuf.rXKh;
import org.swfx.MwBy.vTyh;
import java.awt.Rectangle;

public final class komX implements Cloneable
{
    private int tEdg;
    private long TryJ;
    private long NCuT;
    private long Rarr;
    private long RjRQ;
    
    private static komX tEdg(final Rectangle rectangle) {
        return tEdg(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height);
    }
    
    private static komX tEdg(final long tryJ, final long rarr, final long nCuT, final long rjRQ) {
        final komX komX;
        (komX = new komX()).TryJ = tryJ;
        komX.NCuT = nCuT;
        komX.Rarr = rarr;
        komX.RjRQ = rjRQ;
        return komX;
    }
    
    private static komX tEdg(final long n, final long n2) {
        return tEdg(0L, 0L, n, n2);
    }
    
    public final void tEdg(final vTyh vTyh) {
        vTyh.TryJ();
        this.tEdg = vTyh.TryJ(5);
        this.TryJ = vTyh.NCuT(this.tEdg);
        this.NCuT = vTyh.NCuT(this.tEdg);
        this.Rarr = vTyh.NCuT(this.tEdg);
        this.RjRQ = vTyh.NCuT(this.tEdg);
        vTyh.TryJ();
    }
    
    public final int tEdg() {
        this.tEdg = rXKh.tEdg(true, Math.max(Math.max(Math.max(Math.abs(this.TryJ), Math.abs(this.NCuT)), Math.abs(this.Rarr)), Math.abs(this.RjRQ)));
        return (int)Math.ceil((5.0 + 4.0 * this.tEdg) / 8.0);
    }
    
    private long Rarr() {
        return this.TryJ;
    }
    
    private long RjRQ() {
        return this.NCuT;
    }
    
    private long aqrV() {
        return this.Rarr;
    }
    
    private long LrxC() {
        return this.RjRQ;
    }
    
    private void tEdg(final long tryJ) {
        this.TryJ = tryJ;
    }
    
    private void TryJ(final long nCuT) {
        this.NCuT = nCuT;
    }
    
    private void NCuT(final long rarr) {
        this.Rarr = rarr;
    }
    
    private void Rarr(final long rjRQ) {
        this.RjRQ = rjRQ;
    }
    
    @Override
    public final String toString() {
        return invokedynamic(makeConcatWithConstants:(JJJJ)Ljava/lang/String;, this.TryJ, this.Rarr, this.NCuT, this.RjRQ);
    }
    
    public final long TryJ() {
        return this.NCuT - this.TryJ;
    }
    
    private void RjRQ(final long n) {
        this.NCuT = this.TryJ + n;
    }
    
    public final long NCuT() {
        return this.RjRQ - this.Rarr;
    }
    
    private void aqrV(final long n) {
        this.RjRQ = this.Rarr + n;
    }
    
    public final Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
