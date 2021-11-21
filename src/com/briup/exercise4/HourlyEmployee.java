package com.briup.exercise4;

public class HourlyEmployee extends Employee {
    private double hourlySalary;
    private double totalTime;

    @Override
    public double getSalary(int mouth) {
        double salary=0.0;
        if(mouth==getBir()){
            salary+=100+totalTime*hourlySalary;
            if(totalTime>160){

            }
        }
        return super.getSalary(mouth);
    }
}
