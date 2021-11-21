package com.briup.jdk.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list=
                Arrays.asList("Java","Hadoop",
                        "Mysql","C++","Hbase","Zookeeper");
        list.stream().sorted().filter(x->x.length()>4)
                .filter(x->x.startsWith("H"))
                .sorted().limit(1).sorted()
                .forEach(System.out::println);
    }
}
