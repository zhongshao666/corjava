package com.briup.ioTest;

import com.briup.ioTest.bean.Student;

import java.io.*;

public class ObjecInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis=
                    new FileInputStream(
                            "src/com/briup/ioTest/obj.txt");
            ObjectInputStream oos=
                    new ObjectInputStream(fis);
//            System.out.println(oos.readBoolean());
//            System.out.println(oos.readUTF());
//            System.out.println(oos.readDouble());
//            System.out.println(oos.readLong());
//            System.out.println(oos.readObject());
            Student stu= (Student) oos.readObject();
            System.out.println(stu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
