package com.briup.exercise11;



public class Test1 {
    static class SoulutionTask implements Runnable{
        static int value = 0;
        @Override
        public void run() {
            while (value <= 100){
                //关键字synchronized可以保证在同一时刻，只有一个线程可以执行某个方法或某个代码块，同时synchronized可以保证一个线程的变化可见（可见性），即可以代替volatile
                synchronized (SoulutionTask.class){
                    System.out.println(Thread.currentThread().getName() + ":" + value++);

//                    当线程执行wait()方法时候，会释放当前的锁，然后让出CPU，进入等待状态。
//                    只有当 notify/notifyAll() 被执行时候，才会唤醒一个或多个正处于等待状态的线程，然后继续往下执行，直到执行完synchronized 代码块的代码或是中途遇到wait() ，再次释放锁。

                    SoulutionTask.class.notify();  //唤醒一个正在等待该对象的线程   notify方法只唤醒一个等待（对象的）线程并使该线程开始执行
                    try {
                        SoulutionTask.class.wait();  // 使当前线程等待，直到另一个线程调用       notify 和wait 的顺序不能错，如果A线程先执行notify方法，B线程在执行wait方法，那么B线程是无法被唤醒的
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new SoulutionTask(), "偶数").start();
        new Thread(new SoulutionTask(), "奇数").start();
    }
}
