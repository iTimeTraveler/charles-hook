// 
// Decompiled by Procyon v0.5.36
// 

package org.swfx.MwBy;

import java.io.EOFException;
import java.io.IOException;
import java.io.DataInput;
import java.io.InputStream;

public abstract class vTyh extends InputStream
{
    protected DataInput tEdg;
    private int TryJ;
    private int NCuT;
    
    protected vTyh() {
        this.TryJ = 0;
        this.NCuT = 0;
    }
    
    private vTyh(final DataInput tEdg) {
        this.TryJ = 0;
        this.NCuT = 0;
        this.tEdg = tEdg;
    }
    
    public final void TryJ() {
        this.TryJ = 0;
        this.NCuT = 0;
    }
    
    protected boolean tEdg() {
        return true;
    }
    
    @Override
    public abstract int read();
    
    public final void tEdg(int i) {
        this.TryJ();
        while (i > 0) {
            final int skipBytes;
            if ((skipBytes = this.tEdg.skipBytes(i)) > 0) {
                i -= skipBytes;
            }
            else {
                this.tEdg.readByte();
                --i;
            }
        }
    }
    
    @Override
    public long skip(final long n) {
        throw new IOException("Don't use skip, use skipBytes");
    }
    
    @Override
    public abstract int read(final byte[] p0, final int p1, final int p2);
    
    public abstract void tEdg(final byte[] p0, final int p1, final int p2);
    
    public final int NCuT() {
        this.TryJ();
        if (this.tEdg()) {
            final int int1;
            return (int1 = this.tEdg.readInt()) >>> 24 | (int1 >> 8 & 0xFF00) | (int1 << 8 & 0xFF0000) | int1 << 24;
        }
        return this.tEdg.readInt();
    }
    
    public final int Rarr() {
        this.TryJ();
        if (this.tEdg()) {
            final short short1 = this.tEdg.readShort();
            int n;
            if (((long)(n = ((short1 >>> 8 & 0xFF) | (short1 << 8 & 0xFF00))) & 0x8000L) != 0x0L) {
                n = (int)((long)n | 0xFFFFFFFFFFFF0000L);
            }
            return n;
        }
        return this.tEdg.readShort();
    }
    
    public final int RjRQ() {
        this.TryJ();
        if (this.tEdg()) {
            final int unsignedShort = this.tEdg.readUnsignedShort();
            return (unsignedShort >>> 8 & 0xFF) | (unsignedShort << 8 & 0xFF00);
        }
        return this.tEdg.readUnsignedShort();
    }
    
    private int MnsE() {
        this.TryJ();
        return this.tEdg.readByte();
    }
    
    public final int aqrV() {
        this.TryJ();
        return this.tEdg.readUnsignedByte();
    }
    
    public final boolean LrxC() {
        return (int)this.Rarr(1) == 1;
    }
    
    private String mvCd() {
        final StringBuffer sb = new StringBuffer();
        for (int i = this.aqrV(); i != 0; i = this.aqrV()) {
            sb.append((char)i);
        }
        return sb.toString();
    }
    
    public final String Ffoi() {
        int unsignedByte;
        final byte[] bytes = new byte[unsignedByte = this.tEdg.readUnsignedByte()];
        this.tEdg(bytes, 0, unsignedByte);
        if (bytes[unsignedByte - 1] == 0) {
            --unsignedByte;
        }
        return new String(bytes, 0, unsignedByte, "UTF-8");
    }
    
    private long Rarr(int n) {
        long n2 = 0L;
        int n3;
        while ((n3 = n - this.NCuT) > 0) {
            n2 |= this.TryJ << n3;
            n -= this.NCuT;
            this.TryJ = this.read();
            if (this.TryJ == -1) {
                throw new EOFException("SwfInputStream: end of file");
            }
            this.NCuT = 8;
        }
        final long n4 = n2 | (long)(this.TryJ >>> -n3);
        this.NCuT -= n;
        this.TryJ &= 255 >> 8 - this.NCuT;
        return n4;
    }
    
    public final int TryJ(final int n) {
        return (int)this.Rarr(n);
    }
    
    public final long NCuT(final int n) {
        long n2;
        if (((n2 = (int)this.Rarr(n)) & 1L << n - 1) != 0x0L) {
            n2 |= -1L << n;
        }
        return n2;
    }
    
    private int RjRQ(final int n) {
        return (int)this.NCuT(n);
    }
    
    @Override
    public abstract void close();
    
    private static int aqrV(final int n) {
        return n >>> 24 | (n >> 8 & 0xFF00) | (n << 8 & 0xFF0000) | n << 24;
    }
    
    private static int LrxC(int n) {
        if (((long)(n = ((n >>> 8 & 0xFF) | (n << 8 & 0xFF00))) & 0x8000L) != 0x0L) {
            n = (int)((long)n | 0xFFFFFFFFFFFF0000L);
        }
        return n;
    }
    
    private static int Ffoi(int n) {
        return n = ((n >>> 8 & 0xFF) | (n << 8 & 0xFF00));
    }
}
