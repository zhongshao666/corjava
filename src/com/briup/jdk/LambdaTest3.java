package com.briup.jdk;

public class LambdaTest3 {
    public static String test(String name){
        System.out.println(name+".....");
        return name.toUpperCase();
    }
    public static void main(String[] args) {
        //抽象方法没有返回值，可以用有返回值方法
        //适配，当时将来抽象方法的调用实质是调用
        //适配方法的方法体，但是适配方法的返回值
        //抽象方法获取不到
        ActionTest3 ac=LambdaTest3::test;//无返回值抽象方法可以适配有返回值方法，但参数必须相同
        ac.run("lisi");
    }
}
interface ActionTest3{
    void run(String name);
}
