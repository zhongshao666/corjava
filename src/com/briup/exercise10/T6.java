package com.briup.exercise10;

public class T6 {
    public static void main(String[] args) {

        work5();
    }
    //单例模式
    public static void work5(){

        Singleton singleton=Singleton.getIntance();
        System.out.println("singleton = " + singleton);
        Singleton singleton1=Singleton.getIntance();
        System.out.println("singleton1 = " + singleton1);
        LazzySingleton lazzySingleton=LazzySingleton.getInstance();
        LazzySingleton lazzySingleton1=LazzySingleton.getInstance();
        System.out.println("lazzySingleton = " + lazzySingleton);
        System.out.println("lazzySingleton1 = " + lazzySingleton1);

    }
}

//饿汉模式：无论你需不需要，我都直接创建对象
class Singleton{
    public static Singleton singleton=new Singleton();

    private Singleton(){}

    public static Singleton getIntance(){
        return singleton;
    }
}

//懒汉模式：你需要对象，我才创建当前类的对象
class LazzySingleton{
    public static LazzySingleton lazzySingleton=null;
    private LazzySingleton(){}
    public static LazzySingleton getInstance(){
        if(lazzySingleton==null){
            lazzySingleton=new LazzySingleton();
        }
        return lazzySingleton;
    }
}
