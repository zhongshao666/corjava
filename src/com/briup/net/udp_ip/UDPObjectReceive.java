package com.briup.net.udp_ip;

import com.briup.net.tcp_ip.Student;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPObjectReceive {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DatagramSocket ds = new DatagramSocket(6666);
        byte[] b = new byte[1024 * 63];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);
        ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData(),0,dp.getLength());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Student student=(Student) ois.readObject();
        System.out.println(student);
        ds.close();
    }
}
