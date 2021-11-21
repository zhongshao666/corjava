package com.briup.exercise13;

import java.io.*;

public class T1 {
    public static void main(String[] args) throws IOException {
        new T1().t1();
    }
    public void t1()throws IOException{
        File file = new File("src/com/briup/exercise13/test1");
        File file1 = new File("src/com/briup/exercise13/test2");
        File file2 = new File("src/com/briup/exercise13/test3");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2,true);//追加

        int len=-1;
        byte[] bytes = new byte[1024];
        String s="\r\n";
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream1.write(bytes,0,len);
            fileOutputStream2.write(s.getBytes());
            fileOutputStream2.write(bytes,0,len);
            fileOutputStream1.flush();
            fileOutputStream2.flush();
        }
        System.out.println("执行成功");
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
    public void t2() {

    }
}
