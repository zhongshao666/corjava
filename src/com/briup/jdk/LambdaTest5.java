package com.briup.jdk;

public class LambdaTest5 {
    public static void main(String[] args) {
//        ActionTest5<String,Integer>  ac=
//                (String x)->{
//            return  Integer.parseInt(x);
//        };
//        ActionTest5<String,Integer> ac1=
//                x->Integer.parseInt(x);
        ActionTest5<String,Integer> ac1=Integer::parseInt;
        ActionTest5<String,String> ac2=a->a.toUpperCase();
        ActionTest5<String,String> ac3=String::toUpperCase;
        String name=ac3.run("jake");
        System.out.println(name);
    }
}
interface ActionTest5<S,T>{
    T run(S s);
}
