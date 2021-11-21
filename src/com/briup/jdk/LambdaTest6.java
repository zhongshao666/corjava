package com.briup.jdk;

public class LambdaTest6 {
    public static void main(String[] args) {
        Model model=new Model();
//        ActionTest6<Model> ac=x->{
//            System.out.println("test...");
//        };
//        ac.run(model);
        //test1
        //test5
//        ActionTest6<Model> ac=model::test5;
        //适配的类名和范型参数的类型一致,
        //适配类中无参数的方法
        ActionTest6<Model> ac=Model::test;
        //ac.run(model);
    }
}
interface ActionTest6<T>{
    void run(T t);
}
class Model{
    public void test(){
        System.out.println(this+"*****");
        System.out.println("test....");
    }
    public void test1(Model model){
        System.out.println("test1,,,,,");
    }
    public int test3(){
        System.out.println("test3....");
        return 11;
    }
    public static void test4(Model model){
        System.out.println("static test4.....");
    }
    public int test5(Model model){
        System.out.println("test5,,,,,");
        return 12;
    }

}
