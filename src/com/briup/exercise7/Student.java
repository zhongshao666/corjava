package com.briup.exercise7;

public class Student implements Comparable<Student>{

    private Integer id;
    private String name;
    private double grade;

    public Student() {
    }

    public Student(Integer id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return 0;
    }

/*    @Override
    public int compareTo(Student o) {
//        Student student=(Student)o;
        if(this.getName().equals("ming"))
            return -1;
        else if(o.getName().equals("ming"))
            return 1;
        else {
            if(this.getGrade()>o.getGrade())
                return -1;
            else return 1;
        }
    }*/
}


