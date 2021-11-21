package com.briup.ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis=
                    new FileInputStream(
                            "src/com/briup/ioTest/a.txt");
        try{
            byte[] b=new byte[1024];
            int len;
            while((len=fis.read(b))!=-1){
                System.out.write(b,0,len);
                System.out.flush();
               // System.out.println(new String(b,0,len));
            }
        }catch (IOException e){
           e.printStackTrace();
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
