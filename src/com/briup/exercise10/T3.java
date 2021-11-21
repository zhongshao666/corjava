package com.briup.exercise10;

import java.util.Random;

public class T3 {
    public static void main(String[] args) {

        Run run = new Run();
        run.start();
        //双线程完成    利用静态flag

    }
}

class Run extends Thread{
    @Override
    public void run() {

        int t=0;
        int r=0;
        double s;
//        Random random=new Random();
        while (true){
            s=Math.random();
            System.out.println("s = " + s);
            if(s<=0.3){
                r+=2;
            }else t+=1;
            if(t>=100){
                System.out.println("乌龟赢了");
                System.out.println("t = " + t);
                System.out.println("r = " + r);
                break;
            }
            if(r>=100){
                System.out.println("兔子赢了");
                System.out.println("t = " + t);
                System.out.println("r = " + r);
                break;
            }
        }
        System.out.println(currentThread().getName());

    }
}