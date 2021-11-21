package com.briup.exercise16;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class T1Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        {
            try {
                serverSocket = new ServerSocket(8888);
                Socket socket=serverSocket.accept();
                InputStream is=socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                System.out.println(br.readLine());

                OutputStream os=socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os);
                pw.println("疑是地上霜2");
                pw.flush();

/*                InputStream is1=socket.getInputStream();
                BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));*/
                System.out.println(br.readLine());

/*                OutputStream os1=socket.getOutputStream();
                PrintWriter pw1 = new PrintWriter(os1);*/
                pw.println("低头思故乡4");
                pw.flush();

                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
