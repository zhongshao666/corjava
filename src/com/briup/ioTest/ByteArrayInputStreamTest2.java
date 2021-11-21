package com.briup.ioTest;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest2 {
    public static void main(String[] args) {
        ByteArrayInputStream bais=
                new ByteArrayInputStream("abcdefg".getBytes());
        //skip跳过多少字节从某个位置开始读取
        bais.skip(4);
        System.out.write(bais.read());
        System.out.flush();
    }
}
