package com.briup.exercise5;

public class T4 {
    int a;
    static int b;
    void fa(){}
    static void fb(){}
    public void m1(){
        System.out.println(a);
        System.out.println(b);
        fa();
        fb();
    }

    public static void m2(){
        System.out.println(new T4().a);//
        System.out.println(b);
        new T4().fa();//
        fb();
    }

}
