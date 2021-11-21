package com.briup.exercise1;

public class Change {
    public static void main(String[] args) {
        int a = 3, b = 5;
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
