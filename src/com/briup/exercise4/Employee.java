package com.briup.exercise4;


public class Employee {
    private String name;
    private int bir;
    public double getSalary(int mouth){
        if(bir==mouth){
            return 100;
        }
        return 0;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBir() {
        return bir;
    }

    public void setBir(int bir) {
        this.bir = bir;
    }
}
