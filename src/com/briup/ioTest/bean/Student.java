package com.briup.ioTest.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private long id;
    private String name;
    //transient修饰的变量不进行序列化
    //将对象转化为字节流的时候，transient修饰的变量
    //直接基于默认值转化为字节流
    private transient int age;

    public Student() {
    }

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
