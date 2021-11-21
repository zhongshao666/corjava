package com.briup.ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutPutStreamTest {
    public static void main(String[] args) {
        try {
            File file=new File("src/com/briup/ioTest/b.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            //第二个参数表示是否在原文件的内容基础上追加内容
            //true追加,false默认覆盖效果
            FileOutputStream fos=
                    new FileOutputStream(
                            file,true);
            byte[] nn="\n321321".getBytes();
            fos.write(nn);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
