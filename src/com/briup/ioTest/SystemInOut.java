package com.briup.ioTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {
    public static void main(String[] args) {
        InputStream is=System.in;
        OutputStream os=System.out;
        try {
        int data=-1;
        String str="";
        while(true){
            data=is.read();
            if(data==10){
                if("98121101".equals(str)){
                  break;
                }
                str="";
            }
            if(data!=10){
                str+=data;
            }
            os.write(data);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
               if(os!=null)os.close();
               if(is!=null)is.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
