package com.company.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        // 기본생성자로 막아놔서 아래처럼 쓸 수는 없음.
        // this.socketClient = new SocketClient();

        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
