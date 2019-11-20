// 
// Decompiled by Procyon v0.5.36
// 

package org.aZWr.aZWr.aZWr;

public final class foWu
{
    private static int tEdg = -1;
    private int TryJ;
    private int NCuT;
    private int Rarr;
    private int RjRQ;
    
    public foWu(final int tryJ, final int nCuT, final int rarr, final int rjRQ) {
        this.TryJ = -1;
        this.NCuT = -1;
        this.Rarr = -1;
        this.RjRQ = -1;
        this.TryJ = tryJ;
        this.NCuT = nCuT;
        this.Rarr = rarr;
        this.RjRQ = rjRQ;
    }
    
    public final int tEdg() {
        return this.TryJ;
    }
    
    public final int TryJ() {
        return this.NCuT;
    }
    
    public final int NCuT() {
        return this.Rarr;
    }
    
    public final int Rarr() {
        return this.RjRQ;
    }
    
    public final void tEdg(final int n) {
        this.TryJ = Math.min(n, this.TryJ);
        this.NCuT = Math.max(n, this.NCuT);
    }
    
    public final void TryJ(final int n) {
        this.Rarr = Math.min(n, this.Rarr);
        this.RjRQ = Math.max(n, this.RjRQ);
    }
    
    @Override
    public final int hashCode() {
        return (((31 + this.RjRQ) * 31 + this.Rarr) * 31 + this.NCuT) * 31 + this.TryJ;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof foWu) {
            final foWu foWu = (foWu)o;
            return this.TryJ == foWu.TryJ && this.NCuT == foWu.NCuT && this.Rarr == foWu.Rarr && this.RjRQ == foWu.RjRQ;
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuffer sb;
        (sb = new StringBuffer()).append(invokedynamic(makeConcatWithConstants:(II)Ljava/lang/String;, this.TryJ, this.NCuT));
        sb.append(" ");
        sb.append(invokedynamic(makeConcatWithConstants:(II)Ljava/lang/String;, this.Rarr, this.RjRQ));
        return sb.toString();
    }
}
