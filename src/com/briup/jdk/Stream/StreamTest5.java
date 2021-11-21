package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("test","hello",
                        "world","java","tom",
                        "C","javascript");

        Predicate<String> pr=x->x.length()>4;
        Predicate<String> pr1=x->x.startsWith("j");
        Predicate<String> and=pr.or(pr1);
        //filter对前后传入的每个数据过滤
        //符合filter中参数的lambda表达式，true数据
        //继续做后面的操作，否则直接忽略掉该数据
        list.stream()
                .filter(and)
                .forEach(System.out::println);
//        list.stream()
//                .filter(x->x.length()>4)
//                .filter(x->x.startsWith("j"))
//                .forEach(System.out::println);
    }
}
