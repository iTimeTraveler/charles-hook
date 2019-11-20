// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.MwBy;

import java.io.InputStream;
import com.xk72.proxy.io.iAhS;
import java.io.DataInputStream;

public class foWu extends vTyh
{
    private final DataInputStream TryJ;
    private final iAhS NCuT;
    
    public foWu(final InputStream inputStream) {
        this.NCuT = new iAhS(inputStream);
        this.TryJ = new DataInputStream(this.NCuT);
        super.tEdg = this.TryJ;
    }
    
    public final long MnsE() {
        this.TryJ();
        return this.NCuT.tEdg();
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) {
        this.TryJ();
        return this.TryJ.read(b, off, len);
    }
    
    @Override
    public final void tEdg(final byte[] b, final int n, final int len) {
        this.TryJ();
        this.TryJ.readFully(b, 0, len);
    }
    
    @Override
    public int read() {
        return this.TryJ.read();
    }
    
    @Override
    public void close() {
        this.TryJ.close();
    }
    
    @Override
    public void mark(final int readlimit) {
        this.TryJ.mark(readlimit);
    }
    
    @Override
    public void reset() {
        this.TryJ();
        this.TryJ.reset();
    }
}
