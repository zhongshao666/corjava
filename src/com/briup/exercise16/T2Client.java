package com.briup.exercise16;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class T2Client {
    static boolean status = true;

    public static void main(String[] args) {
        Socket socket;
        try {

            socket = new Socket("127.0.0.1", 8888);
            System.out.println("客户端启动:");


            new Thread(() -> {
                OutputStream os = null;
                DataOutputStream dos = null;
                try {
                    os = socket.getOutputStream();
                    dos = new DataOutputStream(os);

                    while (status) {
                        Scanner scanner = new Scanner(System.in);
                        String str = scanner.next().trim();
                        if (str.equals("再见")) {
                            status = false;
                        }
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
                        System.out.println("服务器：" + msg);
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
