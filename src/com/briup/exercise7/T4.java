package com.briup.exercise7;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class T4 {
    public static void main(String[] args) {
        Set treeSet = new TreeSet();

        Student student1 = new Student(1, "hua", 68);
        Student student2 = new Student(2, "li", 72);
        Student student3 = new Student(3, "mei", 81);
        Student student4 = new Student(4, "ming", 63);
        Student student5 = new Student(5, "zhou", 88);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        Iterator it = treeSet.iterator();

        while (it.hasNext()) {

            Student student = (Student) it.next();

            System.out.println(student);

        }

    }
}



