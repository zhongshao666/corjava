package com.briup.Comment;

public class Teacher {
    /**
    * @Auther zzh 
    * @Description  TODO
    * @Date 2020/7/29 9:45
    * @param null
    * @return 
    **/
    private long id;
    private String name;
    private int age;

    
    //创建构造器后  默认无参构造器失效，需要自己创建
    public Teacher() {
    }

    public Teacher(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(".....");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
