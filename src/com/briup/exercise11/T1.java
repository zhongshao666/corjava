package com.briup.exercise11;

public class T1 {
    public static void main(String[] args) {
        new Thread(new T1R(), "线程一").start();
        new Thread(new T1R(), "线程二").start();
        new Thread(new T1R(), "线程三").start();
    }
}


class T1R implements Runnable {
    static int value = 1;
    static String status="线程一";
    @Override
    public void run() {

        while (value < 18) {
            synchronized (Test1.SoulutionTask.class) {
                if(Thread.currentThread().getName().equals(status)) {
                    System.out.println(Thread.currentThread().getName() + ":" + value++);
                    if (status.equals("线程三"))
                        status="线程一";
                    else if (status.equals("线程二"))
                        status="线程三";
                    else status="线程二";
                        Test1.SoulutionTask.class.notifyAll();  //唤醒所有正在等待该对象的线程   notify方法只唤醒一个等待（对象的）线程并使该线程开始执行
                    try {
                        Test1.SoulutionTask.class.wait();  // 使当前线程等待，直到另一个线程调用       notify 和wait 的顺序不能错，如果A线程先执行notify方法，B线程在执行wait方法，那么B线程是无法被唤醒的
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}