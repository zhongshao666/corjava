package com.briup.exercise10;

public class TestThread {
    public static void main(String[] args) {
        System.out.println("main");
        TestTh testTh = new TestTh();
        testTh.start();
        TestTh testTh1 = new TestTh();
        testTh1.start();
        TestTh testTh2 = new TestTh();
        testTh2.start();
        System.out.println("main");
    }

}

class TestTh  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            String s=Thread.currentThread().getName();
            System.out.println(s + ":"+i);
        }

    }
}

class TestTh2  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            String s=Thread.currentThread().getName();
            System.out.println(s + ":"+i);
        }

    }
}