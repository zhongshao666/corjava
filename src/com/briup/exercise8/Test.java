package com.briup.exercise8;


public class Test {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.briup.exercise8.Stu");
        System.out.println(c);
        Stu stu1 = new Stu();
        System.out.println(stu1.getClass());
        Class c2=Stu.class;
        System.out.println(c2);
    }
}

class Stu {
    private int id;

    public Stu() {
    }

    public Stu(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

