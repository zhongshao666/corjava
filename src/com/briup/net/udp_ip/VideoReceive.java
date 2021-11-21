package com.briup.net.udp_ip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class VideoReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(6666);
        byte[] b = new byte[1024 * 63];

        DatagramPacket dp = new DatagramPacket(b, b.length);
        FileOutputStream fos = new FileOutputStream("src/com/briup/net/udp_ip/test2/xxx.pdf",true);
        byte[] send_b = new byte[100];
        //发送
        DatagramPacket send_dp = new DatagramPacket(send_b, send_b.length, new InetSocketAddress("127.0.0.1", 5555));//这里

        while (true){
            ds.receive(dp);
            if ("end".equals(new String(dp.getData(),dp.getOffset(),dp.getLength())))
                break;
            fos.write(dp.getData(),dp.getOffset(),dp.getLength());
            fos.flush();
            //发送长度回去
            send_dp.setData((dp.getLength()+"").getBytes());
            ds.send(send_dp);
        }
        send_dp.setData("ok".getBytes());
        ds.send(send_dp);
        ds.close();
    }
}
