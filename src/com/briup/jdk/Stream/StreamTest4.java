package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("test.briup1","hello.briup2",
                        "world.briup3","java.briup4",
                        "tom.briup5","C.briup6",
                        "javascript.briup7");

        Stream<String> ss=
                list.stream().flatMap(x->Stream.of("briup_"+x));
        ss.forEach(System.out::println);
//        list.stream()
//                .flatMap(x->{
//                    System.out.println("*");
//                return Stream.of(x.split("[.]"));
//                }).forEach(System.out::println);
    }
}
