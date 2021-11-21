package com.briup.jdk.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list =
                Arrays.asList("test","hello",
                        "world","java","tom",
                        "c","javascript");
        //count统计结果多少个,最终的方法
        long len=list.stream()
                .sorted()
                .filter(x->x.length()>5)
                .count();
        System.out.println(len);
        //Match匹配,allMatch必须所有数据都要满足条件，都满足true
        //只要有一个不满足false
//        boolean b=list.stream().allMatch(x->x.length()>0);
//        System.out.println(b);
        //只要有一个数据匹配返回true
//        boolean b=list.stream()
//                .anyMatch(x->x.startsWith("j"));
//        System.out.println(b);
        //所有元素都不匹配的时候返回true
//        boolean b=list.stream()
//                .noneMatch(x->x.length()<0);
//        System.out.println(b);
        //排序
//        Stream<String> st=list.stream()
//                .sorted((a,b)->-a.compareTo(b));
//        //Stream<String> st=list.stream().sorted();
//        st.forEach(System.out::println);
        //获取Stream对象中的第一个元素
//        Optional<String> op=list.stream().findFirst();
//        Optional<String> op=list.stream().findAny();
//        System.out.println(op.get());
//        FileOutputStream fos=
//                new FileOutputStream(
//                        "src/com/briup/jdk/Stream/a.txt");
        //peak获取前置方法传出的数据，可以得到数据不能修改数据
        // void appcpt(T t)，
//        list.stream()
//                .map(x->x+"_bye")
//                .peek(x->{
//                    try {
//                        fos.write((x+"\n").getBytes());
//                        fos.flush();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }).filter(x->x.length()>6)
//                .sorted()
//                .forEach(System.out::println);
//        list.stream()
//                .peek(x->{
//                    x=x+"_te";
//                    System.out.println("x:"+x);})
//                .forEach(System.out::println);
    }
}
