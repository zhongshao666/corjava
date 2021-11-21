package com.briup.net.udp_ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] b="hello".getBytes();
        //构建发送的数据包
        DatagramPacket dp=new DatagramPacket(b,b.length,new InetSocketAddress("127.0.0.1",9999));
        ds.send(dp);

        ds.close();
    }
}
