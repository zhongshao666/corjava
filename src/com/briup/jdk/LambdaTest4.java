package com.briup.jdk;

public class LambdaTest4 {
    public static void main(String[] args) {
//        ActionTest4 ac=x->new Student(x);
//        Student stu=ac.create("jake");
//        System.out.println(stu);
//        System.out.println(stu.getName());
        //接口中抽象方法参数和构造器中参数的顺序、个数一样，
        // 并且抽象方法返回的是对象
        ActionTest4 ac=Student::new;
        Student s=ac.create("jake");
        System.out.println(s+"---"+s.getName());
    }
}
interface ActionTest4{
    Student create(String name);
}
class Student{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
