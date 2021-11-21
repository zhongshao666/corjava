package com.briup.exercise16;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        System.out.println("我是张三");
        //启动发送消息线程
        new SendThread(s).start();
        //启动接受消息线程
        new RecieveThread(s).start();
    }
}

