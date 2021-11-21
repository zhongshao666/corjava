package com.briup.exercise4;

public class SalesEmployee extends Employee {
    private double mouthSalary;
    private double rate;
    @Override
    public double getSalary(int mouth) {
        double salary=(mouth==this.getBir())?mouthSalary+100:mouthSalary;
        return salary;
    }

}
