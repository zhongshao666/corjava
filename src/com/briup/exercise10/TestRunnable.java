package com.briup.exercise10;

public class TestRunnable {
    public static void main(String[] args) {
        System.out.println("main");
        Runnable runnable=new MyRun();
        Thread thread=new Thread(runnable);
        thread.start();
        Runnable runnable1=new MyRun();
        Thread thread1=new Thread(runnable1);
        thread1.start();
        System.out.println("main");
    }

}

class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            String s=Thread.currentThread().getName();
            System.out.println(s + ":"+i);
        }
    }
}
