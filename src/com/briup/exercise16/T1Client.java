package com.briup.exercise16;

import java.io.*;
import java.net.Socket;

public class T1Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            OutputStream os=socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.println("床前明月光1");
            pw.flush();

            InputStream is=socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println(br.readLine());

/*            OutputStream os1=socket.getOutputStream();
            PrintWriter pw1 = new PrintWriter(os1);*/
            pw.println("举头望明月3");
            pw.flush();

/*            InputStream is1=socket.getInputStream();
            BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));*/
            System.out.println(br.readLine());

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
