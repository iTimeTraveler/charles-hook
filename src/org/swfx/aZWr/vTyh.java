// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.aZWr;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

public final class vTyh
{
    private foWu tEdg;
    private List<kQqI> TryJ;
    
    public final void tEdg(final org.swfx.aZWr.aZWr.vTyh vTyh) {
        (this.tEdg = new foWu()).tEdg(vTyh);
        vTyh.NCuT();
        this.TryJ = new ArrayList<kQqI>();
        try {
            while (true) {
                final kQqI kQqI;
                (kQqI = new kQqI()).tEdg(vTyh);
                this.TryJ.add(kQqI);
                vTyh.NCuT();
            }
        }
        catch (EOFException ex) {
            vTyh.close();
        }
    }
    
    public final foWu tEdg() {
        return this.tEdg;
    }
    
    private void tEdg(final foWu tEdg) {
        this.tEdg = tEdg;
    }
    
    public final List<kQqI> TryJ() {
        return this.TryJ;
    }
    
    private void tEdg(final List<kQqI> tryJ) {
        this.TryJ = tryJ;
    }
}
