package com.briup.ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutPutStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis=
                    new FileInputStream(
                            "src/com/briup/ioTest/a.txt");
            FileOutputStream fos=
                    new FileOutputStream(
                            "src/com/briup/ioTest/b.txt",
                            true);
            int len;
            byte[] b=new byte[1024];
            while((len=fis.read(b))!=-1){
                fos.write(b,0,len);
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
