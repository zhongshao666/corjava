package com.briup.jdk;

import java.util.function.BiConsumer;

public class LambdaTest14 {
    public static void main(String[] args) {
        //void accept(T t, U u);
        BiConsumer<String,String> bc=
                (a,b)-> System.out.println(a+"--"+b);
        BiConsumer<String,String> bc1=
                (a,b)-> System.out.println(a+"**"+b);
        BiConsumer<String,String> cus=bc.andThen(bc1);
        cus.accept("test","briup");
    }
    /*
    default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }
     */
}
