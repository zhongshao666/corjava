package com.briup.jdk;

public class LambdaTest1 {
    public static void main(String[] args) {
//        ActionTest1 ac=new ActionTest1() {
//            @Override
//            public void run() {
//                System.out.println("test....");
//            }
//        };
//        ac.run();
        ActionTest1 ac=()->{//根据参数匹配抽象方法
            //....
            System.out.println("test...1");
        };
//        ac.run();
        ac.test();
    }
}
//lambda表达式要求接口中只能有一个抽象方法
//接口中可以有默认方法和静态的方法
//lamdba表达式基于接口中抽象方法给出的方法体
//不能调用接口中其他非静态的方法
//@FunctionalInterface 标识接口
//是一个函数式接口（要求接口只有一个抽象方法）
@FunctionalInterface
interface ActionTest1{
    void run();
    default public void test(){
        run();
        System.out.println("test....");
    }
    public static void test1(){
        System.out.println("static....test1");
    }
}
