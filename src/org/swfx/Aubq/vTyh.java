// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.Aubq;

public final class vTyh
{
    public static int tEdg(final boolean b, final long n) {
        if (n == 0L) {
            return 0;
        }
        final int n2;
        if ((n2 = (int)Math.ceil(Math.log((double)(n + 1L)) / Math.log(2.0)) + (b ? 1 : 0)) < 0) {
            return 0;
        }
        return n2;
    }
    
    public static int tEdg(final boolean b, final long a, final long a2, final long a3, final long a4) {
        return tEdg(true, Math.max(Math.max(Math.max(Math.abs(a), Math.abs(a2)), Math.abs(a3)), Math.abs(a4)));
    }
    
    private static int tEdg(final boolean b, final long a, final long a2, final long a3, final long a4, final long a5, final long a6) {
        return tEdg(b, Math.max(Math.max(Math.max(Math.max(Math.max(Math.abs(a), Math.abs(a2)), Math.abs(a3)), Math.abs(a4)), Math.abs(a5)), Math.abs(a6)));
    }
    
    private static int tEdg(final boolean b, final long a, final long a2, final long a3, final long a4, final long a5, final long a6, final long a7, final long a8) {
        return tEdg(b, Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.abs(a), Math.abs(a2)), Math.abs(a3)), Math.abs(a4)), Math.abs(a5)), Math.abs(a6)), Math.abs(a7)), Math.abs(a8)));
    }
    
    private static int tEdg(final boolean b, final long a, final long a2) {
        return tEdg(b, Math.max(Math.abs(a), Math.abs(a2)));
    }
}
