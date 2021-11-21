package com.briup.exercise6;

public class T6 {
    public static void main(String[] args) {
        L a = new L(129L);
        L b = new L(129L);
        Long num = a.id;
        Long num2 = b.id;
        System.out.println(num.equals(num2));
        System.out.println(num == num2);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

    }
}

class L {
    public Long id;

    public L(Long id) {
        this.id = id;
    }
}