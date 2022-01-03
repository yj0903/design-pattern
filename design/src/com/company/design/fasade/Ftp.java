package com.company.design.fasade;

public class Ftp {
    private String host;
    private int port;
    private String path;

//default constructor
    public Ftp(String host, int port, String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }
    //method
    public void connect(){
        System.out.println("FTP Host : "+host+" Port : "+port+"로 연결");
    }
    public void moveDirectory(){
        System.out.println("FTP path: "+path+"로 이동");
    }
    public void disconnect(){
        System.out.println("FTP Host 연결 종료");
    }
}
