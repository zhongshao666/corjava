package com.briup.ioTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystenInTest2 {
    public static void main(String[] args) {
        InputStream is=System.in;
        try {
            byte[] b=new byte[10];
            //read第二个参数表示读取的字节放在数组中的起始位置
            //第三个参数表示读取的字节可以最多放在字节数组中的长度
            int len=is.read(b,3,2);
            System.out.println(len+":"+Arrays.toString(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
