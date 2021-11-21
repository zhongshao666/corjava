package com.briup.exerxise15;

import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class T2 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream("src/com/briup/exerxise15/grade.txt"));
            int len;
            StringBuilder str = new StringBuilder();
            while ((len = isr.read()) != -1) {
                str.append((char) len);
            }
            String str1=str.toString();
            String[] strings = str1.split("\n");
//            int[] strings1=new int[5];
            int x;
            int i=0;
            int min=0;
            int max=0;
            String ss;
            for (String s : strings
            ) {
                ss=(s.split("[-]")[4]);
                System.out.println("ss = " + ss);
                x = Integer.parseInt(ss.trim());
                min=x;
                if(x<min) {
                    min=x;
                }
                if(x>max) {
                    max=x;
                }
                i++;
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);

/*            Arrays.sort(strings1);


            for (int j = 0; j <strings1.length ; j++) {
                if(strings[j].split("[-]")[4].equals(strings1[0])){
                    System.out.println("最低分：");
                    System.out.println(strings[j]);
                }else if (strings[j].split("[-]")[4].equals(strings1[4])){
                    System.out.println("最高分：");
                    System.out.println(strings[j]);
                }
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert isr != null;
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
