package com.briup.exercise6;

public class T2 {
    static {
        System.out.println("静态代码块执行了");
    }

    public T2(){
        System.out.println("构造器执行了");
    }

    {
        System.out.println("匿名代码块执行了");

    }

    public static void main(String[] args) {
        T2 t2 = new T2();
        System.out.println("----------");
        t2=new T2();
    }
}
