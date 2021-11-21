package com.briup.exercise1;

public class ToBinary {
    public static void main(String[] args) {
        int a = 21;
        System.out.println("binary=" + toBinary(a));
        System.out.println("octal=" + toOctal(a));
        System.out.println("hex=" + toHex(a));
        toAny(a);


    }

    public static String toBinary(int num) {
        String b = "";
        for (; num != 1; ) {
            b = num % 2 + b;
            num /= 2;
            if (num == 1)
                b = num + b;
        }
        return b;
    }

    public static String toOctal(int num) {
        String b = "";
        while (true){
            b = num % 8 + b;
            if ((num / 8) >= 1) {
                num /= 8;
            }
            else break;
        }
        return b;
    }

    public static String toHex(int num) {
        String b = "";
        while (true){
            b = num % 16 + b;
            if ((num / 16) >= 1) {
                num /= 16;
            }
            else break;
        }
        return b;
    }

    public static void toAny(int num) {
        System.out.println("二进制为" + Integer.toBinaryString(num));
        System.out.println("八进制为" + Integer.toOctalString(num));
        System.out.println("十六进制为" + Integer.toHexString(num));
    }
}
