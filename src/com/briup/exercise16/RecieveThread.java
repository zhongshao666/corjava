package com.briup.exercise16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveThread extends Thread {
    private Socket scoket;

    public RecieveThread(Socket scoket) {
        this.scoket = scoket;
    }

    public void run() {
        try {
            InputStream is = scoket.getInputStream();

            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String msg = dis.readUTF();
                if(scoket.getPort()==8888){
                    System.out.print("\t\t张三:");
                }else{
                    System.out.print("\t\t李四:");
                }
                System.out.println(""+msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
