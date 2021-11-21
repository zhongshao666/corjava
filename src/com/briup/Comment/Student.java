package com.briup.Comment;

public class Student {
    /**
     * @param args
     * @return void
     * @Auther zzh
     * @Description TODO
     * @Date 2020/7/28 11:35`                                                                                           ············
     **/
    /* 注解将来程序编译成字节码  注解会被删除*/
    public static void main(String[] args) {
        String a="abc";
        String b="ab";
        String c="c";
        String d=new String("abc");  //堆中
        System.out.println("666");
        System.out.println((b+c)==a);  //  "==" 比较的是地址值
        System.out.println("ab" + "c" == a);
        System.out.println(a==d);
    }
}