package com.briup.exercise14;

import java.io.File;

public class T3 {
    static int deep = 0;
    public static void main(String[] args) {
        work(new File("D:\\java源码系列\\corjava\\src"));
    }

    private static void work(File file) {

        deep++;
        for (int i = 0; i < deep; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files
            ) {
                work(f);//判断完往回走
                deep--;
            }
        }
    }
}
