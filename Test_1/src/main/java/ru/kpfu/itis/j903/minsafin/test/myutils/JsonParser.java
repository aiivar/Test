package ru.kpfu.itis.j903.minsafin.test.myutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JsonParser extends InputStream {
    private InputStream in;

    public JsonParser(InputStream in) {
        this.in = in;
    }

    public Map<String, String> getMap(){
        //TODO read entry and return new Map
        return null;
    }

    @Override
    public int read() throws IOException {
        return in.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return in.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return in.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return in.skip(n);
    }

    @Override
    public int available() throws IOException {
        return in.available();
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

    @Override
    public void mark(int readlimit) {
        in.mark(readlimit);
    }

    @Override
    public void reset() throws IOException {
        in.reset();
    }

    @Override
    public boolean markSupported() {
        return in.markSupported();
    }
}
