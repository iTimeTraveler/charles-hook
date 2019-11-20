// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.aZWr;

import java.io.IOException;
import org.swfx.MwBy.vTyh;
import com.xk72.util.EmeJ;
import java.io.InputStream;

public final class foWu
{
    private int tEdg;
    private boolean TryJ;
    private boolean NCuT;
    private byte[] Rarr;
    
    public static boolean tEdg(final InputStream inputStream) {
        final byte[] array = new byte[3];
        EmeJ.tEdg(inputStream, array);
        return tEdg(array);
    }
    
    public static boolean tEdg(final byte[] array) {
        return array[0] == 70 && array[1] == 76 && array[2] == 86;
    }
    
    public final void tEdg(final vTyh vTyh) {
        final byte[] array = new byte[3];
        vTyh.read(array, 0, 3);
        if (!tEdg(array)) {
            throw new IOException("Not an FLV file");
        }
        this.tEdg = vTyh.aqrV();
        vTyh.TryJ(5);
        this.TryJ = vTyh.LrxC();
        vTyh.TryJ(1);
        this.NCuT = vTyh.LrxC();
        final int n = vTyh.NCuT() - 9;
        vTyh.read(this.Rarr = new byte[n], 0, n);
    }
    
    private byte[] Rarr() {
        return this.Rarr;
    }
    
    private void TryJ(final byte[] rarr) {
        this.Rarr = rarr;
    }
    
    public final boolean tEdg() {
        return this.TryJ;
    }
    
    private void tEdg(final boolean tryJ) {
        this.TryJ = tryJ;
    }
    
    public final boolean TryJ() {
        return this.NCuT;
    }
    
    private void TryJ(final boolean nCuT) {
        this.NCuT = nCuT;
    }
    
    public final int NCuT() {
        return this.tEdg;
    }
    
    private void tEdg(final int tEdg) {
        this.tEdg = tEdg;
    }
}
