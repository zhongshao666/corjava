package com.briup.jdk.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest8 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br=
                new BufferedReader(
                        new FileReader(
                                "src/com/briup/jdk/Stream/a.txt"));
        //lines方法把读取文件中的每一行内容作为Stream的一个元素
        //每一个元素不包含换行操作
        //12  14
        //12        x14 y12

//        Stream<String> s=br.lines();
//        Optional<Integer> op=
//                s.map(x->{x.length()}).max((x, y)->x-y);
//        System.out.println(op.get());
        //s.forEach(System.out::println);
//        Stream<String> s=br.lines();
//        final int num[]={0};
//        final String[] str={""};
//                s.map(x->{
//                    num[0]++;
//                    if(x.length()>str[0].length())
//                        str[0]=x+":"+num[0];
//                    return x.length();
//                }).count();
//        System.out.println(str[0]);
        //System.out.println(op.get());
    }
}
