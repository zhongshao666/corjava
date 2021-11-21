package com.briup.jdk;
/*
接口中
1.抽象的方法
2.属性是常量
3.可以有默认方法(default修饰方法，方法有方法体)
默认方法的调用基于子实现，子实现可以重写默认方法
4.可以有静态的方法,静态方法的调用->接口的名字.静态方法名
 */
public interface Formul {
    void say();
    default void go(){
        System.out.println("go....");
    }
    default public void test(){
        System.out.println("test.....");
    }
    public static void test1(){
        System.out.println("static ..test1....");
    }

    public static void main(String[] args) {
        //Formul.test1();
        Formul f=new Formul() {
            @Override
            public void go() {
                System.out.println("child...go");
            }

            @Override
            public void say() {
                System.out.println("say....");
            }
        };
        f.go();
        f.test();
        Formul.test1();
    }
}
