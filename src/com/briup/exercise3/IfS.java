package com.briup.exercise3;

import java.util.Scanner;

public class IfS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int status = 0;
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0){
                    status += 1;
                    System.out.println(i+"---倍数为"+(x/i));
                }
            }
            if (status >= 1)
                System.out.println(x + "不是素数");
            else System.out.println(x + "是素数");
            status = 0;
        }
    }
}
