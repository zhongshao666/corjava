package com.briup.jdk;

import java.util.function.Predicate;

public class LambdaTest7 {
    private int k=20;
    private static int j=30;
    public static void main(String[] args) {
        new LambdaTest7().test();
    }
    public void test(){

        int num=10;//默认final
        //lambda表达式使用局部变量的时候，默认局部变量自动
        //变成final常量，lambda表达式也可以访问全局（的静
        // 态和非静态的）变量
        ActionTest7 ac=x->x+k+j+num;
        int sum=ac.count(10);
        System.out.println(sum);
        k=22;
        j=33;
    }
}
interface ActionTest7{
    int count(int num);
}
