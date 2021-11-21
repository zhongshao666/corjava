package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamtest12 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("test","hello",
                        "world","java","tom","C"
                        ,"javascript");
        Map<Boolean,List<String>> map=
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        x->x.indexOf("java")!=-1));
        //groupingBy分组
        //Map中的第一个参数和分组的标准类型一致，
        //第二个参数表示组中的元素
//        Map<Integer,List<String>> map=list.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                x->x.length()));
//        for(Map.Entry<Integer,List<String>>
//                en:map.entrySet()){
//            System.out.println("key:"+en.getKey());
//            for(String str:en.getValue()){
//                System.out.println(str);
//            }
//            System.out.println("******");
//        }


//        Map<Boolean,List<String>> map=
//                list.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                x->x.startsWith("j")));
        for(Map.Entry<Boolean,List<String>>
                en:map.entrySet()){
            System.out.println("key:"+en.getKey());
            for(String str:en.getValue()){
                System.out.println(str);
            }
            System.out.println("******");
        }

    }
}
