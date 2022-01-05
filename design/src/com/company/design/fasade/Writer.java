package com.company.design.fasade;

public class Writer {
    private String filename;

    public Writer(String filename) {
        this.filename = filename;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결.", filename);
        System.out.println(msg);
    }
    public void fileWrite(){
        String msg = String.format("Writer %s에 파일쓰기.", filename);
        System.out.println(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Writer %s 연결종료.", filename);
        System.out.println(msg);
    }

}
