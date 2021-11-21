package com.briup.ioTest;

import com.briup.ioTest.bean.Student;

import java.io.*;
import java.util.Date;
/*
java中传输对象基于字节传输（文件或者网络）
序列化
将对象转化为字节流
反序列化
将字节流转化为对象
java要求对传输的对象序列化Serializable
 */
public class ObjecOutputStreamTest  {
    public static void main(String[] args) {
        try {
            FileOutputStream fis=
                    new FileOutputStream(
                            "src/com/briup/ioTest/obj.txt");
            ObjectOutputStream oos=
                    new ObjectOutputStream(fis);
//            oos.writeBoolean(true);
//            oos.writeUTF("string");
//            oos.writeDouble(234.22);
//            oos.writeLong(100L);
//            oos.writeObject(new Date());
            Student s=new Student(1,"jake",30);
            //s:com.briup.ioTest.bean.Student@61bbe9ba
            //com.briup.ioTest.bean.Student@723279cf
            oos.writeObject(s);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
