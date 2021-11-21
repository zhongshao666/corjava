package com.briup.ioTest;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest1 {
    public static void main(String[] args) {
        byte[] b="abcdefg".getBytes();
        ByteArrayInputStream bais=
                new ByteArrayInputStream(b);
        //流允不允许标记.markSupported()返回true支持，false不支持
        //System.out.println(bais.markSupported());//true
        //mark()在读取某个字节的时候做标记
        //reset()直接跳回到标记位重新读取数据
        System.out.write(bais.read());
        System.out.flush();
        bais.mark(4);
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.println("重置");
        bais.reset();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();
        System.out.write(bais.read());
        System.out.flush();


    }
}
