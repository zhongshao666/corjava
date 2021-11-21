package com.briup.exercise10;

public class AssertTest {
    public static void main(String[] args) {
        new AssertTest().test(-6);
    }

    public void test(int num){
        assert num>0;      //在 VM options  加-ea
        System.out.println("test........."+num);
    }
}
