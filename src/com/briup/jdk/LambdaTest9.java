package com.briup.jdk;

import java.util.function.Function;
/*
Function<T, R>
R apply(T t);
default <V> Function<T, V>
andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
 */
public class LambdaTest9 {
    public static void main(String[] args) {
//        Function<String,Integer> fun=x->x.length();
//        Function<String,String> fun=x->"**"+x;
//        Function<String,String> before=x->"briup_"+x;
//        Function<String,String> nu=fun.compose(before);
//        nu.apply("tom");//**briup_tom
//        Function<String,String> nu=
//                        fun.andThen(before);
//        String name=nu.apply("tom");
//        System.out.println(name);
        String name="tom";
        //R apply(T t);
//        Function<String,Stu> fun=x->new Stu(x);
//        Function<String,String> fun1=x->"briup_"+x;
//        Function<String,Stu> su=fun.compose(fun1);
//        Function<String,Stu> su1=fun1.andThen(fun);
//        Stu s=su1.apply(name);
//        System.out.println(s.getName());
        Function<String,String> fun=
                Function.identity();//t->t
        String ne=fun.apply("name");
        System.out.println(ne);
    }
}
class Stu{
    private String name;

    public Stu() {
    }

    public Stu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
