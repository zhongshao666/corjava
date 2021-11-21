package com.briup.exercise16;

import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 8888);
        System.out.println("我是李四");
        // 启动发送消息线程
        new SendThread(s).start();
        // 启动接受消息线程
        new RecieveThread(s).start();
    }
}
