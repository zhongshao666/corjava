package com.briup.exercise5;

public class T7 {
    public static void main(String[] args) {
        final MyClass1 myClass1=new MyClass1();
        int value=5;
        final int FVALUE=10;
        myClass1.printValue(value);
        myClass1.printValue(FVALUE);
        myClass1.changeValue(value);
        myClass1.changeValue(FVALUE);

        myClass1.a=10;
//        myClass1.B=10;
//        myClass1=new MyClass1();
        System.out.println(myClass1.a+myClass1.B);
    }
}


class MyClass1{
    public int a=10;
    public final int B=10;
    public void printValue(final int value){
        System.out.println("value = " + value);
    }
    public void changeValue(int value){
        value*=2;
        System.out.println("value = " + value);
    }
}