package com.briup.jdk;

import java.util.function.BiFunction;
import java.util.function.Function;


public class LambdaTest12 {
    public static void main(String[] args) {
        //R apply(T t, U u);
//        BiFunction<String,String,Integer> bf=
//                (x,y)->x.length()+y.length();
//        int bun=bf.apply("apple","test");
//        System.out.println(bun);
        //R apply(T t, U u);
        BiFunction<String,String,Integer> bf1=
                (x,y)->x.compareTo(y);
        ////R apply(T t);
        Function<Integer,String> fun=x->x+"...test";
        BiFunction<String,String,String> bb=
                bf1.andThen(fun);
        String bun1=bb.apply("apple","test");
        System.out.println(bun1);//-19...test
    }
    /*
default <V> BiFunction<T, U, V>
        andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
    }
 */
}
