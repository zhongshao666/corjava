package com.briup.ioTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystenInTest1 {
    public static void main(String[] args) {
        InputStream is=System.in;
        try {
            byte[] b=new byte[10];
            //将读到的字节直接存入b字节数组
            //返回值表示读取的长度是多少
            int len=is.read(b);
            System.out.println(len+":"+Arrays.toString(b));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(is!=null)is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
