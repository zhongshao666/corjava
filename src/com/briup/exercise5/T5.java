package com.briup.exercise5;

public class T5 {
    public static void main(String[] args) {
        int a=0;
        a++;
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a);
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        MyClass myClass = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();
    }

}

class MyClass{
    static int count=0;

    public MyClass() {
        count++;
        System.out.println("count = " + count);
    }
}
