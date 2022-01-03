package com.company.design.fasade;

public class Reader {
    private String filename;

    //default constructor
    public Reader(String filename) {
        this.filename = filename;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s로 연결.", filename);
        System.out.println(msg);
    }
    public void fileRead(){
        String msg = String.format("Reader %s 읽기.", filename);
        System.out.println(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Reader %s 연결종료.", filename);
        System.out.println(msg);
    }
}
