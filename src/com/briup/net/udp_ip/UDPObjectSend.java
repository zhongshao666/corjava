package com.briup.net.udp_ip;

import com.briup.net.tcp_ip.Student;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPObjectSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(5555);
        Student student = new Student(66, "zhoushao");
        //发送数据的包
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(student);
        oos.flush();
        byte[] arr = baos.toByteArray();
        System.out.println("发送数据的长度"+(arr.length)/1024.0);
        //构建发送数据的包
        DatagramPacket dp=new DatagramPacket(arr,arr.length,new InetSocketAddress("127.0.0.1",6666));
        ds.send(dp);
    }
}
