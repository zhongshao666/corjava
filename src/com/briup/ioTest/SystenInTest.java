package com.briup.ioTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SystenInTest {
    public static void main(String[] args) {
        InputStream is=null;
        //从控制台读取数据
        is=System.in;//BufferedInputStream
//        System.out.println(is.getClass());
        //read方法会使程序处于阻塞状态，
        //控制台输入内容回车之后不处于阻塞状态
        try {
            int data=is.read();
            System.out.println(data);//228
            data=is.read();
            System.out.println(data);
            data=is.read();
            System.out.println(data);
            data=is.read();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
