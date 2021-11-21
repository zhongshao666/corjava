package com.briup.net.tcp_ip;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DataTCPServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(7777);
        while (true){
            Socket socket=server.accept();
            InputStream is= socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            Student student=(Student) ois.readObject();
            System.out.println(student);
            socket.close();
        }
    }
}
