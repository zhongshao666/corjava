package com.briup.exercise4;

public class T2 {
    public static void main(String[] args) {
        //8位，数据范围-128~127，-2^7~2^
        byte b1 = 100;
        byte b2 = (byte) 200;//超范围，精度丢失
        //截断前面的得到  1100 1000
        //  补码->原码  -1 取反 1100 0111
        //              1011 1000  = -56
        System.out.println(b2);
        System.out.println(b1 + b2);

        float f = 1.1f;
        System.out.println(f);

        char c1 = 20013;
        System.out.println(c1);
        short s = 20013;
        char c2 = (char) s;
        System.out.println(c2);

        int x=20013;
        System.out.println(x);
    }
}
