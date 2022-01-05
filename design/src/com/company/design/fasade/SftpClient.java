package com.company.design.fasade;

public class SftpClient {
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    // default constructor
    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }
    // overloading: 같은 이름 but 다른 인자 또는 다른 자료형
    public SftpClient(String host, int port, String path, String filename) {
        this.ftp = new Ftp(host, port, path);
        this.reader = new Reader(filename);
        this.writer = new Writer(filename);
    }
    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        reader.fileConnect();
        writer.fileConnect();
    }
    public void disconnect(){
        // 역순으로 끊는다.
        writer.fileDisconnect();
        reader.fileDisconnect();
        ftp.disconnect();
    }
    public void read(){
        reader.fileRead();
    }
    public void write(){
        writer.fileWrite();
    }
}
