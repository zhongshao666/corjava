package com.briup.jdk.Stream;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {
    public static void main(String[] args) {
        //iterate 和generator都是模拟产生数据
        //数据最大long.max_value,
        //注意iterate 和generator都要加limit限制
//       Stream.iterate(10,x->x+3)
//               .limit(100)
//               .forEach(System.out::println);
        TreeSet<Integer> tree=
                Stream.iterate(10,x->x+3)
                .limit(100)
                .collect(Collectors.toCollection(
                        ()->new TreeSet<>((x,y)->-(x-y))));
        //System.out.println(tree.size());
        tree.forEach(System.out::println);
    }
}
