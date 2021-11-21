package com.briup.net.tcp_ip;

import sun.nio.cs.ext.GBK;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            //accept阻塞   监听端口有无客户端接入
            //有客户接入构建一个socket对象
            //socket网络套接字，内部有读取网络的流和写入网络
            //数据的流
            Socket socket = server.accept();
            System.out.println(socket);
            //获取的是网络输出流
            OutputStream os=socket.getOutputStream();
//            PrintWriter pw=new PrintWriter(os);
            os.write("欢迎访问...\n".getBytes("GBK"));
            os.flush();
            socket.close();

        }
    }
}
