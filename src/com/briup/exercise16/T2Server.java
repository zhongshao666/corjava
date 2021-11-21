package com.briup.exercise16;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class T2Server {
    static boolean status = true;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端启动：");
            Socket socket=serverSocket.accept();

            new Thread(() -> {
                OutputStream os = null;
                DataOutputStream dos = null;
                try {
                    os = socket.getOutputStream();
                    dos = new DataOutputStream(os);

                    while (status) {
                        Scanner scanner = new Scanner(System.in);
                        String str = scanner.next();

                        dos.writeUTF(str);
                        dos.flush();

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Thread.interrupted();
            }).start();
            new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();

                    DataInputStream dis = new DataInputStream(is);
                    while (status) {
                        String msg = dis.readUTF();
                        System.out.println("客户端："+msg);
                        if (msg.equals("再见")) {
                            status = false;
                        }

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Thread.interrupted();
            }).start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

