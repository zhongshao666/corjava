package com.briup.ioTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutPutStreamTest {
    public static void main(String[] args) {
        try {
        //流目的地写到缓存中（内存）的字节数组中
        ByteArrayOutputStream bos=
                new ByteArrayOutputStream(5);
        //返回缓存区中字节数组实际使用的长度
        System.out.println(bos.size());
        //[-28, -72, -83]
        bos.write(-28);
        bos.write(-72);
        bos.write(-83);
        bos.write(97);
        bos.write(98);
        bos.write(99);
        bos.write(100);
        bos.write(101);
        bos.write(102);
        bos.flush();
        //将缓存中的字节数据取出赋给新的字节数组返回
        byte[] bb=bos.toByteArray();
            System.out.println(Arrays.toString(bb));
        //System.out.println(bos.size());
//            System.out.println("before:"+bos.toString());
            //清空缓存区中字节数组中的数据
//            bos.reset();
//            System.out.println("after:"+bos.toString());
            //将缓存中的字节数组安装某种编码转化位字符串
//            System.out.println(bos.toString("GBK"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
