// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

public abstract class vTyh extends foWu implements iAhS
{
    private Integer qaiR;
    
    public vTyh(final int n) {
        super(n);
    }
    
    @Override
    public final void tEdg(final org.swfx.MwBy.foWu foWu) {
        this.qaiR = foWu.RjRQ();
        this.TryJ(foWu);
    }
    
    protected abstract void TryJ(final org.swfx.MwBy.foWu p0);
    
    @Override
    public final Integer tEdg() {
        return this.qaiR;
    }
    
    @Override
    public final void tEdg(final Integer qaiR) {
        this.qaiR = qaiR;
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;, this.qaiR, super.toString());
    }
}
