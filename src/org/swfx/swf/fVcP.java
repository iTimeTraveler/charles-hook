// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import java.util.HashMap;

public final class fVcP
{
    private final HashMap<Integer, iAhS> tEdg;
    
    public fVcP() {
        this.tEdg = new HashMap<Integer, iAhS>();
    }
    
    private void tEdg(final iAhS value) {
        Integer key;
        if ((key = value.tEdg()) == null) {
            int n;
            for (n = 1; this.tEdg.get(n) != null; ++n) {}
            key = n;
            value.tEdg(key);
        }
        if (this.tEdg(key) != null) {
            throw new IllegalStateException(invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;)Ljava/lang/String;, key));
        }
        this.tEdg.put(key, value);
    }
    
    private iAhS tEdg(final Integer key) {
        return this.tEdg.get(key);
    }
    
    public final iAhS tEdg(final int i) {
        return this.tEdg(Integer.valueOf(i));
    }
    
    private HashMap<Integer, iAhS> tEdg() {
        return this.tEdg;
    }
    
    private void TryJ(final iAhS iAhS) {
        this.tEdg.remove(iAhS.tEdg());
    }
    
    private void TryJ(final Integer key) {
        this.tEdg.remove(key);
    }
    
    private Integer TryJ() {
        int n;
        for (n = 1; this.tEdg.get(n) != null; ++n) {}
        return n;
    }
}
