package com.briup.exercise10;

public class T1 {


    public static void main(String[] args) {
        new Thread(() -> {
            {
                int s = 0;
                for (int i = 1; i <= 10000; i++) {
                    s += i;
                }
                System.out.println("内部类  s = " + s);
            }
        }).start();
        T1Thread thread = new T1Thread();
        thread.start();
        Runnable runnable=new T1Runnable();
        Thread thread1=new Thread(runnable);
        thread1.start();


    }
}

class T1Thread extends Thread {
    @Override
    public void run() {
        int s = 0;
        for (int i = 1; i <=10000 ; i++) {
            s+=i;
        }
        System.out.println("Thread  s = " + s);
    }
}

class T1Runnable implements Runnable {

    @Override
    public void run() {
        int s = 0;
        for (int i = 1; i <=10000 ; i++) {
            s+=i;
        }
        System.out.println("Runnable  s = " + s);
    }
}