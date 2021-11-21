package com.briup.jdk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list=
                Arrays.asList("hello","apple","byebye");
        //Collections.sort(list);
        /*
        "hello" compare("hello","hello")
        结果:"hello"
        "apple" compare("apple","hello")
                "apple".compareTo("hello");-1
         */
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

//        Collections.sort(list,(String o1,String o2)->{
//            return -o1.compareTo(o2);
//        });
        //lambda表达式就是面向接口中抽象方法构建实例
        //并补充抽象方法的方法体
//        Comparator<String> ca=(String o1,String o2)->{
//            return -o1.compareTo(o2);
//        };
//        int n=ca.compare("apple","hello");
//        System.out.println(n+"****");

//        Comparator<String> ca=(o1,o2)->{
//            return -o1.compareTo(o2);
//        };

//        Comparator<String> ca=(o1,o2)-> -o1.compareTo(o2);
//        Collections.sort(list,ca);

        for(String str:list){
            System.out.println(str);
        }
    }
}
