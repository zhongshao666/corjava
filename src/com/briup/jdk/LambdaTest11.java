package com.briup.jdk;

import java.util.function.Consumer;
/*
default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
 */
public class LambdaTest11 {
    public static void main(String[] args) {
        //void accept(T t);
        Consumer<String> cus=
                x->{ System.out.println(x+"****");};
        Consumer<String> cus1=
                x->{ System.out.println(x+"&&&");};
        Consumer<String> and=cus.andThen(cus1);
        and.accept("jake");
    }
}
