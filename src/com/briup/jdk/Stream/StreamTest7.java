package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("test","java",
                        "hello","world","java",
                        "tom","C","javascript");

        //max获取排序之后的最后一个元素
        //min获取排序之后的第一个元素
        Optional<String> op=
                list.stream().max((x,y)->-x.compareTo(y));
        System.out.println(op.get());
        //distinct()去掉重复的元素
//        list.stream()
//                .distinct()
//                .forEach(System.out::println);
        //skip跳过前几个元素开始取值
//        list.stream()
//                .skip(2)
//                .forEach(System.out::println);
        //limit获取前面处理数据的前多少个
//        list.stream()
//                .filter(x->x.length()>4)
//                .limit(2)
//                .forEach(System.out::println);
        //test      a javap     b test
//        Optional<String> str=list.stream()
//                .sorted((a,b)->-(a.length()-b.length()))
//        .filter(x->x.startsWith("j"))
//        .flatMap(x-> Stream.of(x+"_briup"))
//        .reduce((x,y)->x+"|"+y);
//        System.out.println(str.get());
//        Optional<String> str=list.stream()
//                .sorted((a,b)->-(a.length()-b.length()))
//                .filter(x->x.startsWith("j"))
//                .map(x-> x+"_briup")
//                .reduce((x,y)->x+"|"+y);
//        System.out.println(str.get());
//       String str=list.stream()
//                .sorted((a,b)->-(a.length()-b.length()))
//                .filter(x->x.startsWith("j"))
//                .map(x-> x+"_briup")
//                .collect(Collectors.joining("|"));
//        System.out.println(str);

//        IntStream is=
//                IntStream.rangeClosed(1,100);
//        int opi=is.reduce(50,
//                (x, y)->{
//                    System.out.println(x+"---"+y);
//                    return x+y;
//                });
//        System.out.println(opi);
//        OptionalInt opi=is.reduce(
//                (x, y)->{
//                    System.out.println(x+"---"+y);
//                    return x+y;
//                });
        //System.out.println(opi.getAsInt());
    }
}
