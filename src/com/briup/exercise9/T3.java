package com.briup.exercise9;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
/*        try {
            methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        int i=methodB();
        System.out.println(i);*/
        System.out.println(test());
        System.out.println(test1());
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double s=scanner.nextDouble();
            try {
                T6(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void methodA() throws Exception {
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int methodB() {
        try {
            System.out.println("进入方法B");
            return 1;
        } catch (Exception e) {
            e.getMessage();
        }
        return 2;
    }

    private static int test() {
        int ret = 0;
        try {
            return ret;
        } finally {
            ret = 2;
        }
    }

    private static int test1() {
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        } finally {
            return 2;
        }
    }

    private static void T6(double s) throws Exception {

        if (s <= 100 && s >= 0) {
            System.out.println("成绩为：" + s);
        }
        else throw new Exception("分数不合法");

    }

}
