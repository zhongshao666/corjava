package com.briup.jdk;

import java.util.function.BinaryOperator;
/*
public static <T> BinaryOperator<T>
        minBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
    }
 */
public class LambdaTest13 {
    public static void main(String[] args) {
        BinaryOperator<String> str=
                BinaryOperator.minBy((x,y)->x.compareTo(y));
        String na=str.apply("apple","test");
        System.out.println(na);
        //T apply(T ,T)
//        BinaryOperator<String> str=(x,y)->x+"--"+y;
//        String syrs=str.apply("hello","word");
//        System.out.println(syrs);
    }
}
