package com.briup.jdk.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        //把Stream转化为其他数组或集合
        //Stream只能被使用一次
        List<String> list=
                Arrays.asList("one","two","three","app");
        Stream<String> s=list.stream();
        //把stream中数据拼接
//        String str=s.collect(Collectors.joining());
        String str=s.collect(Collectors.joining("-"));
        System.out.println(str);
        //stream-->collection
        //collect 收集数据方法，把前面处理满足条件的数据
        //收集装入集合或处理，collect最终的方法
        //stream转为自定义的集合
//        TreeSet<String> ts=
//                s.collect(
//                        Collectors.toCollection(
//                                ()->new TreeSet<>(
//                                        (x,y)->-x.compareTo(y))));
//        TreeSet<String> ts=
//        s.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(ts);
//        LinkedList<String> linkedList=
//        s.collect(
//                Collectors.toCollection(
//                        LinkedList::new));
//        s.collect(
//                Collectors.toCollection(
//                        ()->new LinkedList<>()));
//        System.out.println(linkedList);
        //stream->ArrayList
//        List<String> li=s.collect(Collectors.toList());
//        System.out.println(li);//ArrayList
//        System.out.println(li.getClass().getName());
        //stream->hashset
//        Set<String> set=s.collect(Collectors.toSet());
//        System.out.println(set);//hashset
//        System.out.println(set.getClass().getName());
//        //转化为数组
//        Object[] ob=  s.toArray();
//        System.out.println(Arrays.toString(ob));
//        String[] str=s.toArray(x->{
//            return new String[x];
//        });
//        String[] str=s.toArray(String[]::new);
//        System.out.println(Arrays.toString(str));



    }
}
