package com.briup.ioTest;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
[-28, -72, -83] UTF-8
[-42, -48] GBK
[-2, -1, 78, 45] UNICODE
[-42, -48] GB2312
 */
public class Test {
    public static void main(String[] args)
            throws UnsupportedEncodingException {
        //byte[] b="中".getBytes();
        //系统中有很多套编码，JVM内部使用的是UNICODE
//        byte[] b="中".getBytes("UTF-8");
//        System.out.println(Arrays.toString(b));
        //回车,光标带动光标后的内容直接回到当前行的首个位置
       // System.out.println("hello\rwo");//wollo 13
        //\n换行 \n后的内容进入下一行
        System.out.println("hello\nworld");//10
    }
}
