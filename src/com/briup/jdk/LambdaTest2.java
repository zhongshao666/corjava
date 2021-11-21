package com.briup.jdk;

public class LambdaTest2 {
    public static void main(String[] args) {
//        ActionTest2 ac=(String num)->{ //匹配
//            return Integer.parseInt(num);
//        };

//        ActionTest2 ac=(x)->{
//            return Integer.parseInt(x);
//        };

//        ActionTest2 ac=x->Integer.parseInt(x);
//        int nu=ac.run("233");
//        System.out.println(nu);

//        ActionTest2 ac=Integer::parseInt;//引用Integer下的parseInt,等价上方
//        int x=ac.run("22");
//        System.out.println(x);
        //类名::方法，调用某个类中的静态方法
        //适配接口中抽象的方法，前提：静态方法
        //和接口中抽象的方法参数和返回值一致
//        ActionTest2 ac=LambdaTest2::get;
//        int x=ac.run("jake");
//        System.out.println(x);
        //接口中的抽象方法适配类中的非静态方法
        //必须保证非静态方法使用之前构建对象
        //对象::方法名
        LambdaTest2 la=new LambdaTest2();
        ActionTest2 ac=la::say;
        int x=ac.run("jake");
        System.out.println(x);
    }
    public static int get(String name){
        System.out.println("yyyy");
        return name.length();
    }
    public int say(String name){
        return name.length()+5;
    }
    public void go(String name){
        System.out.println("go.....");
    }
    public void go(){
        System.out.println("No.....");
    }
}
interface ActionTest2{
    int run(String num);
    default public void test(String nm){
        System.out.println("tets...");
    }
}
