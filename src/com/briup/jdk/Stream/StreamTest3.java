package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("test","hello",
                        "world","java","tom","C",
                        "javascript");
        //map-->R apply(T t)
        //map对stream中的元素一对一处理，处理完成
        //在装回新stream对象
        Stream<String> st=list.stream().map(x->x+"_bye");
        st.forEach(System.out::println);


//        list.stream().map(x->{
//            return x.length();
//        }).forEach(x->{
//                    System.out.println(x);
//                });

    }
}
