package com.briup.exercise14;

import java.io.*;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[2];
        int i=0;
        for (;i<2;){
            strings[i] = scanner.next();
            i++;
        }
        String s= strings[0] + "=" + strings[1];
        byte[] byte1;
        byte1=s.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("src/com/briup/exercise14/data.txt"))) {
            fileOutputStream.write(byte1);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] b=new byte[1024];
        int len=-1;
        try (FileInputStream fileInputStream=new FileInputStream(new File("src/com/briup/exercise14/data.txt"))){
            while((len=fileInputStream.read(b))!=-1){

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
