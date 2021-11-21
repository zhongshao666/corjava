package com.briup.Comment;

public class Person {
    private int id=1;
    protected int age=66;
    public Person() {
        System.out.println("父类");
        System.out.println(this );
        System.out.println(id);
    }
}
