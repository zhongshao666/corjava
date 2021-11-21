package com.briup.ioTest;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutTest {
    public static void main(String[] args) {
        OutputStream os=System.out;
        try {
            os.write(-28);
            //注意：流从java中写出到目的地（内存、文件、网络）
            //有些流不是直接写数据出去，而是把数据写入流维护的缓存中
            //当缓存中的数据写满一次性把数据写出，如果缓存中数据
            //没有写满，也希望数据从缓存刷出去可以调用flush方法
            os.write(-72);
            //-28, -72, -83
            os.write(-83);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(os!=null) os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
