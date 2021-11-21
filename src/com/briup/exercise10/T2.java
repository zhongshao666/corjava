package com.briup.exercise10;

import java.util.Random;

public class T2 {

    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        numThread.setName("T1");
        numThread.start();
        NumThread numThread1 = new NumThread();
        numThread1.setName("T2");
        numThread1.start();


    }
}

class NumThread extends Thread {

    private static boolean flag;
    @Override
    public void run() {


        for (int i = 1; i < 101; i++) {
            if(flag)
                break;
            if (i == 100) {
                flag=true;
                System.out.println(Thread.currentThread().getName()+"  i = " + i);
                break;
            }

            System.out.println(Thread.currentThread().getName()+"  i = " + i);

/*            try {
                Thread.sleep((long) (Math.random()*2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}