package com.briup.ioTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayInputStreamTest {
    public static void main(String[] args) {
        ByteArrayInputStream bais=
                new ByteArrayInputStream(
                        "abcdef".getBytes());
        int data=-1;
        byte [] b=new byte[10];
        while(bais.available()>0){
            //System.out.println(bais.read());
            //System.out-->PrintStream
            System.out.write(bais.read());
            System.out.flush();
            System.out.close();
        }
//        try {
//            data=bais.read(b);
//            System.out.println(data+":"+
//                    Arrays.toString(b) +":"
//                    +bais.available());
//            data=bais.read(b);
//            System.out.println(data+":"+
//                    Arrays.toString(b) +":"
//                    +bais.available());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //
//        while((data=bais.read())!=-1){
//            System.out.println(data+":"+bais.available());
//        }

        //bais.available()判断还有多少字节可以被读取
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());
//
//        data=bais.read();
//        System.out.println(data+":"+bais.available());

    }
}
