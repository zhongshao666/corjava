package com.briup.exercise16;



import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest2 {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream os=null;
        PrintWriter pw=null;
        Scanner sc=null;
        String message=null;

        InputStream is=null;
        BufferedReader br=null;
        try{
            socket=new Socket("127.0.0.1",8333);
            sc=new Scanner(System.in);
            pw=new PrintWriter(socket.getOutputStream());
//            16213724
            //接收服务器信息
            is=socket.getInputStream();
            br=new BufferedReader(new InputStreamReader(is));

            //从客户端控制台输入内容
            //将控制台内容发送给服务器
            while(!(message=sc.nextLine()).equals("88")){
                pw.println(message);
                pw.flush();
                System.out.println("服务器："+br.readLine());
            }
            pw.println("88");
            pw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(br!=null)br.close();
                if(pw!=null)pw.close();
                if(socket!=null)socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
