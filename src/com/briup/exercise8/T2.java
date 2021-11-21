package com.briup.exercise8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class T2 {
    private static Set<Integer> getNoRepeatNumBySet(int len) {
        Random random = new Random();
        Set<Integer> set = new HashSet<Integer>();
        do {
            int s = random.nextInt(len) + 1;
            set.add(s);//Integer.valueOf(arr[s])
        } while (set.size() <= 6);
        return set;
    }

    public static void main(String[] args) {
/*        int[] a = new int[33];
        int[] b = new int[16];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }*/
/*        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }*/
        int a = 33;
        int b = 16;
        Set<Integer> set = getNoRepeatNumBySet(a);
        System.out.println("红色号码：");
        for (int x : set
        ) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("蓝色号码：");
        System.out.println(new Random().nextInt(b) + 1);
        while (true){
            int x=new Random().nextInt(b) + 1;
            if (x==16)
            {
                System.out.println("x = " + x);
                break;
            }
        }
        System.out.println(new Random().nextInt(2) + 1);
    }
}
