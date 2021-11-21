package com.briup.exercise12;

public class T1 {
    public static void main(String[] args) {

        new Test().test();
    }
}

class Storage {
    private int a = -1;

    public synchronized void counter(int a) {
        this.a = a;//存

        try {
            if (a != 99)
                this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.notifyAll();
    }

    public synchronized void printer() {
        this.notifyAll();

        if (a == -1) {//无输出，等待生产

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a = " + a);//拿
        a = -1;//标记


    }
}

class Counter extends Thread {
    Storage storage;

    public Counter() {
    }

    public Counter(Storage storage) {

        this.storage = storage;
    }

    @Override
    public void run() {
        //生产数字并放入仓库
        for (int i = 0; i < 100; i++) {
            storage.counter(i);

        }
    }
}

class Printer extends Thread {
    Storage storage;

    public Printer() {
    }

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.printer();

        }
    }
}

class Test {
    public void test() {
        Storage storage = new Storage();
        new Counter(storage).start();
        new Printer(storage).start();
    }
}