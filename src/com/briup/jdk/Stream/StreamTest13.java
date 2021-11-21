package com.briup.jdk.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StreamTest13 {
    public static void main(String[] args) {
//        System.out.println(UUID.randomUUID());
        List<UUID> list =
                new ArrayList<>(1000000);
        for(int i=0;i<1000000;i++){
            UUID uuid=UUID.randomUUID();
            list.add(uuid);
        }
        //串型操作，一个线程在执行，
        long start_date=System.nanoTime();
        //long num=list.stream().sorted().count();
        //并行，一般一个函数对应一个线程，多个线程并行执行
        long num= list.parallelStream().sorted().count();
        long end_date=System.nanoTime();
        System.out.println("总耗时:"+(end_date-start_date));
        //904804060 串型
        //700288681 并型
        //626879298

    }
}
