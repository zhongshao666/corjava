package com.briup.net.udp_ip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/*
 * zzh
 * videoSend->receive
 * package
 **/
public class VideoSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(5555);
        FileInputStream fis = new FileInputStream("src/com/briup/net/udp_ip/test1/JAVA.pdf");
        byte[] b = new byte[1024 * 63];
        //发送
        DatagramPacket send_dp = new DatagramPacket(b, b.length, new InetSocketAddress("127.0.0.1", 6666));

        //接收
        byte[] r_b = new byte[100];
        DatagramPacket receive_dp = new DatagramPacket(r_b, r_b.length);

        int len;
        while ((len = fis.read(b)) != -1) {
            send_dp.setData(b, 0, len);
            ds.send(send_dp);
            //接收对方发回的消息
            ds.receive(receive_dp);
            System.out.println("数据长度" + new String(receive_dp.getData(), receive_dp.getOffset(), receive_dp.getLength()));
        }
        byte[] end = "end".getBytes();
        send_dp.setData(end);
        ds.send(send_dp);
        ds.receive(receive_dp);
        System.out.println("结束" + new String(receive_dp.getData(), receive_dp.getOffset(), receive_dp.getLength()));
    }
}
