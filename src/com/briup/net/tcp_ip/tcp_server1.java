package com.briup.net.tcp_ip;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp_server1 {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8888);

            System.out.println("监听在端口号:12345");
//        while (true){
//            Socket socket=server.accept();
//            new ServerThread(socket).start();
            Socket socket = server.accept();
            //
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            System.out.println("write");
            pw.println("欢迎!!!");
            System.out.println("write end");
            pw.flush();
            //
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("接收客户端数据" + br.readLine());

            OutputStream os1 = socket.getOutputStream();
            PrintWriter pw1 = new PrintWriter(os1);
            pw1.println("bye");
            pw1.flush();

            socket.close();
            server.close();
//        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerThread extends Thread{
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {

        //
        OutputStream os= null;
        try {
            os = socket.getOutputStream();

        PrintWriter pw=new PrintWriter(os);
        pw.println("欢迎!!!");
        pw.flush();
        //
        InputStream is=socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("接收客户端数据"+br.readLine());

        OutputStream os1=socket.getOutputStream();
        PrintWriter pw1=new PrintWriter(os1);
        pw1.println("bye");
        pw1.flush();

        socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
