package com.briup.exercise10;

public class T4 extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName());
    }
    public T4() {
        this.setName("TYUT");
    }
    public static void main(String[] args) {
        T4 test = new T4();
        test.run();

    }
}

