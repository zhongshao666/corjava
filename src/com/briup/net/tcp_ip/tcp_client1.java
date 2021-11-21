package com.briup.net.tcp_ip;

import java.io.*;

import java.net.Socket;
import java.net.UnknownHostException;

public class tcp_client1 {
    public static void main(String[] args)  {

/*        //客户端构建
        Socket socket = new Socket("127.0.0.1", 12345);
        InputStream is= socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("服务器:" + br.readLine());
        //
        OutputStream os=socket.getOutputStream();
        os.write("Hello...\n".getBytes());
        os.flush();

        System.out.println("服务器1"+br.readLine());
        socket.close();*/
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            InputStream is= socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("print");
            System.out.println("服务器:" + br.readLine());
            System.out.println("print  end");
            //
            //
            OutputStream os=socket.getOutputStream();
            os.write("Hello...\n".getBytes());
            os.flush();
            System.out.println("服务器1"+br.readLine());
            socket.close();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
