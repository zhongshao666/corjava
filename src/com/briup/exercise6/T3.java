package com.briup.exercise6;


public class T3 {

    static {
        System.out.println("父类静态执行了？？？");

    }

    {
        System.out.println("父类匿名代码块执行？？？");
    }



    public static void main(String[] args) {
        new T3();
        new Son();
    }


}




class Father {
    static {
        System.out.println("父类静态执行了");

    }

    {
        System.out.println("父类匿名代码块执行");
    }

    public Father() {
        System.out.println("父类构造器执行");
    }

}

class Son extends Father {
    static {
        System.out.println("子类静态代码块执行");
    }

    {
        System.out.println("子类匿名代码块执行");
    }

    public Son() {
        System.out.println("子类构造器执行");
    }
}