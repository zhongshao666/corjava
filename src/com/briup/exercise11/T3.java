package com.briup.exercise11;

public class T3 {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(new T3R(lock), "线程一").start();
        new Thread(new T3R1(lock), "线程二").start();
    }
}

class T3R implements Runnable {
    private Object lock;

    public T3R(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 52; i++) {

                System.out.print(i);
                if (i % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        }
    }
}

class T3R1 implements Runnable {
    private Object lock;

    public T3R1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (char c = 'A'; c <= 'Z'; c++) {

                lock.notifyAll();
                System.out.print(c);
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}