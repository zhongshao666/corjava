package com.briup.net.udp_ip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9999);
        byte[] b = new byte[128];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        //接收数据
        //receive阻塞状态，监控当前程序端口是否有包到达，有包到达就把到达的数据接收到包中
        ds.receive(dp);
        System.out.println(Arrays.toString(b));
        //接收包中的缓存数组
        System.out.println(Arrays.toString(dp.getData()));
        //获取数据放入缓存字节数组的起始位置
        System.out.println(dp.getOffset());
        //当前接收了多少数组
        System.out.println(dp.getLength());
        System.out.println(dp.getAddress().toString());
        System.out.println(dp.getPort());
    }
}
