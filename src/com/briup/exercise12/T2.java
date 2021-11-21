package com.briup.exercise12;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        Park park = new Park();
        new InPark("car1", park).start();
        new InPark("car2", park).start();
        new InPark("car3", park).start();
        new OutPark("car2", park).start();
        new InPark("car4", park).start();
/*        new InPark("car5", park).start();
        new OutPark("car1", park).start();
        new InPark("car6", park).start();
        new InPark("car7", park).start();*/
    }
}

class Park {
    //    int[] parks = new int[3];
//    String[] car = new String[3];
    List<String> list = new ArrayList<>();

    public synchronized void outPark(String name) {//出库
        if (list.contains(name)) {//判断是否在车库
            list.remove(name);
            System.out.println(name+"出库成功");
            this.notifyAll();
        }
    }

    public synchronized void inPark(String name) {//入库
        if (list.size() >= 3) {//判断是否在车库
            System.out.println("车库已满," + name + "请稍等");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            list.add(name);
            System.out.println(name+"入库成功");
        }
    }
}

class OutPark extends Thread {
    Park park;
    String name;

    public OutPark() {
    }

    public OutPark(String name, Park park) {
        this.name = name;
        this.park = park;
    }

    @Override
    public void run() {
        park.outPark(name);
    }
}

class InPark extends Thread {
    String name;
    Park park;

    public InPark() {
    }

    public InPark(String name, Park park) {
        this.name = name;
        this.park = park;
    }

    @Override
    public void run() {
        park.inPark(name);
    }
}