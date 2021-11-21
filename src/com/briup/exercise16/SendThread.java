package com.briup.exercise16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SendThread extends Thread{
    private Socket socket;

    public SendThread(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try {
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            while(true){
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                dos.writeUTF(str+"\t\t"+DateFormatUtils.dateToStr(new Date()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

