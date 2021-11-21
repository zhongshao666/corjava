package com.briup.exercise13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class T3 {
    public static void main(String[] args) throws IOException {
//        File file=new File("com/briup/exercise13/T3file");
//        FileInputStream fileInputStream=new FileInputStream(file);
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader=new FileReader("src/com/briup/exercise13/T3file");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        String name;
        String age;
        String sex;
        while (bufferedReader.ready()){
            line=bufferedReader.readLine();
            if (line.equals(""))
                    continue;
            String[] arr= line.split("-");
            name= arr[0].split(":")[1];
            age= arr[1].split(":")[1];
            sex= arr[2].split(":")[1];
            studentList.add(new Student(name,age,sex));
        }
        System.out.println("读取成功，以下为写入的对象");
        studentList.forEach(System.out::println);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src/com/briup/exercise13/T3fileOut")));
        objectOutputStream.writeObject(studentList);
        objectOutputStream.flush();
        System.out.println("写入成功！！！");
    }
}

class Student implements Serializable{
    private String name;
    private String age;
    private String sex;

    public Student() {
    }

    public Student(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
