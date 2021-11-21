package com.briup.jdk;

import java.util.function.Supplier;

public class LambdaTest10 {
    public static void main(String[] args) {
        Supplier<String> sup=()->"test";
        System.out.println(sup.get());
    }
}
