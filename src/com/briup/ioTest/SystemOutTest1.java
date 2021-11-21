package com.briup.ioTest;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutTest1 {
    public static void main(String[] args) {
        OutputStream os=System.out;
        byte[] b="helloworld".getBytes();
        try {
            //os.write(b);
            //第二个参数表示从数组的第几个位置开始向外写，
            //第三个参数表示写出去的长度
            os.write(b,2,6);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(os!=null)os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
