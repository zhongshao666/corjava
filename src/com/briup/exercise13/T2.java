package com.briup.exercise13;

import java.io.*;
import java.util.*;

public class T2 {
    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>();
        Map<Integer, Person> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入用户名、密码和体重：");
        int i=1;
        while (scanner.hasNext()){

            String str= scanner.nextLine();
            if (str.equals("#"))
                break;
            String[] arr = str.split("\\s+");
            map.put(i,new Person(arr[0], arr[1], arr[2]));
            i++;
        }
        System.out.println("以下为输入的对象：");
        for (Integer key:map.keySet()
        ) {
            System.out.println(map.get(key).toString());
        }

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("src/com/briup/exercise13/obj");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.flush();
            System.out.println("写入成功！！！");
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("写入出现BUG!!!");
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream= new  FileInputStream("src/com/briup/exercise13/obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Map<Integer,Person> map1 =(HashMap) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("读取成功，以下为对象：");
            for (Integer key:map1.keySet()
                 ) {
                System.out.println(map.get(key).toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Person implements Serializable{
    private String id;
    private String password;
    private String weight;

    public Person() {
    }

    public Person(String id, String password, String weight) {
        this.id = id;
        this.password = password;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}