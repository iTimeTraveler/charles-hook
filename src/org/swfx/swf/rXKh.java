// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;
import org.swfx.MwBy.foWu;

public final class rXKh extends vTyh
{
    private int qaiR;
    
    public rXKh() {
        super(10);
    }
    
    @Override
    public final String toString() {
        final StringBuffer sb;
        (sb = new StringBuffer()).append("Unnamed, ");
        sb.append(this.qaiR);
        sb.append(" glyphs");
        return sb.toString();
    }
    
    @Override
    protected final void TryJ(final org.swfx.MwBy.foWu foWu) {
        final int rjRQ = foWu.RjRQ();
        this.qaiR = rjRQ / 2;
        final int[] array;
        (array = new int[this.qaiR])[0] = rjRQ;
        for (int i = 1; i < this.qaiR; ++i) {
            array[i] = foWu.RjRQ();
        }
        foWu.tEdg(this.TryJ() - rjRQ);
    }
    
    @Override
    public final void tEdg(final kQqI kQqI) {
    }
    
    private void tEdg(final int qaiR) {
        this.qaiR = qaiR;
    }
    
    public final int NCuT() {
        return this.qaiR;
    }
}
