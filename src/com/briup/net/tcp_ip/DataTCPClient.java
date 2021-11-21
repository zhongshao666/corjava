package com.briup.net.tcp_ip;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DataTCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 7777);

        OutputStream os= socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Student student = new Student(66, "zhoushao");
        oos.writeObject(student);
        oos.flush();
        socket.close();
    }
}
