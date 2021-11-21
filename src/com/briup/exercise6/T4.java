package com.briup.exercise6;

public class T4 {
    public static void main(String[] args) {
        new Son1();
    }
}

class Father1 {
    public int a;

    public Father1() {
        printA();
    }

    public void printA() {
        System.out.println("你好666");
    }
}

class Son1 extends Father1{
    public int a=10;

    public Son1() {
    }
    public void printA() {
        System.out.println(a);
    }
}
