package com.briup.Comment;

public class TeacherTest {
    public static void main(String[] args) {
        //new基于类构造器
        //左边存在栈       右边存在堆  左右有对应编码
        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.setId(66);
        Teacher tea=teacher;
        tea=teacher;
        teacher.setId(77);

        System.out.println("teacher = " + teacher.getId());
        System.out.println("tea = " + tea.getId());
        System.out.println("teacher = " + teacher);
        System.out.println("tea = " + tea);
        System.out.println("-----------------");
        // 普通变量不同
        int a=6;
        int b=a;
        a=9;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
