package com.briup.jdk.Stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //Stream构建
        //Stream<String> s=Stream.of("test");
        //Stream.of(T... t)
//        Stream<String> s=
//                Stream.of("test","java","c++");
        String str[]={"test","java","c++"};
//        Stream<String> s=Stream.of(str);
//        Stream<String> s= Arrays.stream(str);
        //集合只要是Collection的子类
        //直接调用stream方法
        List<String> list=new ArrayList<>();
        list.add("test");
        Stream<String> s=list.stream();
        Set<String> set=new HashSet<>();
        set.add("jaba");
        Stream<String> ss=set.stream();

//        Stream<Integer> si=
//                Stream.of(1,2,3,4);
        //int类型的Stream
        IntStream is=IntStream.of(3);
        IntStream is1=IntStream.of(1,2,3,4,3);
        int[] n={1,2,3,4,5};
        IntStream is2=IntStream.of(n);

        //[1,100) 步长
        IntStream is3=IntStream.range(1,100);
//        is3.forEach(System.out::println);

        //[1,100] Stream对象中产生1到100的数据
        IntStream is4=
                IntStream.rangeClosed(1,100);
        is4.forEach(System.out::println);


    }
}
