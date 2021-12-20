package com.company.design.singleton;

// 싱글톤 디자인이란,
// 빗대자면 복사기 같은 것. 모든 pc들이 하나의 복사기에 접속해 복사하는 것처럼
// 클라이언트들이 하나의 객체에 접속해 특정 기능을 수행하는 것.

public class SocketClient {
    private static SocketClient socketClient = null;

    // 기본생성자를 private으로 해서 여러개 생기는거 막아줌
    private SocketClient(){
    }

    // 없으면 만들고, 있으면 기존꺼를 리턴
    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
     }
}
