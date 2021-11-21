package com.briup.exercise9;

import java.util.EnumSet;

public class   Student {

    private int id;
    private String name;
    private String classes;
    private double score;

    public static void main(String[] args) {

    }

    Student() {
    }

    Student(int id, String name, String classes, double score) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

enum Gender{
    Female("女"){
        @Override
        public void test() {
            this.setNum(16);
            System.out.println(this.getNum());
            System.out.println("this.desc = " + this.desc);
        }
    },Male("男") {
        @Override
        public void test() {
            this.setNum(17);
            System.out.println(this.getNum());
            System.out.println("this.desc = " + this.desc);
        }
    };
    public String desc;
    private int num;
    Gender(){   //private

    }

    Gender(String desc){
        this.desc=desc;
    }

    public abstract void test();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
