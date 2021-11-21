package com.briup.exercise3;

import static java.lang.Math.pow;   //使用了静态导入

public class Daffodils {
    public static void main(String[] args) {
        int a, c, d;
        for (int x = 100; x < 1000; x++) {
            a = x / 100;
            c = x % 100 / 10;
            d = x % 10;
            if (x == pow(a, 3) + pow(c, 3) +pow(d, 3))  //使用了静态导入
                System.out.println(x);
        }
    }
}
