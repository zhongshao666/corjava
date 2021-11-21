package com.briup.Comment;

public class Man extends Person {
    /*
    * @Auther zzh
    * @Description  TODO
    * @Date 2020/7/31 11:12
    * @param
    * @return
    **/
    /* 子类创建对象时会隐式调用父类的构造方法  不管有无参构造方法都会默认调用父类的构造方法
    全局变量也会继承     private无权限访问
     */
    public Man() {
        System.out.println("子类");
        System.out.println(this);
    }

    public static void main(String[] args) {
        Man man = new Man();
        System.out.println("父类age="+man.age);
    }
}
