package com.briup.jdk.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class StreamTest9 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br=
                new BufferedReader(
                        new FileReader(
                                "src/com/briup/jdk/Stream/a.txt"));
        Stream<String> s=br.lines();
        s.flatMap(x->Stream.of(x.split(" ")))
                .map(x->x.toUpperCase())
                .filter(x->x.trim().length()>0)
                .distinct()
                .sorted()
                .forEach(System.out::println);
//                .map(x->x.toUpperCase())

    }
}
