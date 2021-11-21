package com.briup.exercise9;

public enum  TestEnum {
    FEMALE("女"){
        @Override
        void say() {
            System.out.println("???");
        }

        @Override
        public void sayHello() {  //重写下方(父类)方法
            System.out.println("hello.....");
        }
    },MALE("男"){
        @Override
        void say() {
            System.out.println("666");
        }

        @Override
        public void sayHello() {
            System.out.println("hello。。。。。");
        }
    };
    private String name;
    private static String msg;

    TestEnum(String name) {
        this.name = name;
    }
    abstract void say();

    public void sayHello(){
        System.out.println("h......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getMsg() {
        return msg;
    }

    public static void setMsg(String msg) {
        TestEnum.msg = msg;
    }

    public static void main(String[] args) {
        Enum e=TestEnum.FEMALE;
        ((TestEnum) e).say();
        ((TestEnum) e).sayHello();
    }
}
