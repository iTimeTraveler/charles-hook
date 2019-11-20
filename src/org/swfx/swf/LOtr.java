// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.swf;

import com.xk72.proxy.MwBy.kQqI;
import java.io.IOException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import com.xk72.amf.foWu;

public final class LOtr implements foWu
{
    private SwfMovie qaiR;
    private final List<org.swfx.swf.foWu> BKlK;
    
    public LOtr() {
        this.BKlK = new ArrayList<org.swfx.swf.foWu>();
    }
    
    private LOtr(final SwfMovie qaiR) {
        this.BKlK = new ArrayList<org.swfx.swf.foWu>();
        this.qaiR = qaiR;
    }
    
    public final void tEdg(final org.swfx.MwBy.foWu foWu) {
        final hFso tryJ = this.qaiR.TryJ();
        while (true) {
            int rjRQ;
            try {
                rjRQ = foWu.RjRQ();
            }
            catch (EOFException ex) {
                ex.printStackTrace();
                return;
            }
            final int n = rjRQ >>> 6;
            int nCuT;
            if ((nCuT = (rjRQ & 0x3F)) == 63) {
                nCuT = foWu.NCuT();
            }
            if (n == 0) {
                return;
            }
            final org.swfx.swf.foWu tEdg;
            (tEdg = tryJ.tEdg(n)).tEdg(this);
            final long n2 = foWu.MnsE() + nCuT;
            tEdg.tEdg(foWu, n, nCuT);
            if (foWu.MnsE() != n2) {
                if (n2 <= foWu.MnsE()) {
                    throw new IOException(invokedynamic(makeConcatWithConstants:(IILjava/lang/String;J)Ljava/lang/String;, n, nCuT, tEdg.getClass().getName(), foWu.MnsE() - n2));
                }
                foWu.tEdg((int)(n2 - foWu.MnsE()));
            }
            this.BKlK.add(tEdg);
        }
    }
    
    public final void tEdg(final kQqI kQqI) {
    }
    
    private SwfMovie TryJ() {
        return this.qaiR;
    }
    
    public final void tEdg(final SwfMovie qaiR) {
        this.qaiR = qaiR;
    }
    
    public final List<org.swfx.swf.foWu> tEdg() {
        return this.BKlK;
    }
}
