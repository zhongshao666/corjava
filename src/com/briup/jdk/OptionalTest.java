package com.briup.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args)
            throws Exception {
        //构建Optional of操作不能接收null值
        Optional<String> op=Optional.of("test");
        //ofNullable可以存放null值
        Optional<String> op1=
                Optional.ofNullable(null);
        //filter对Optional中数据取的时候判断，
        //为true返回值，为false报错
        //boolean test(T t)
        Optional<String> oop=op.filter(x->x.length()>3);
        System.out.println(oop.get());
        //flatMap对Optional的值提供处理操作，返回值
        //要求是Optional包裹的数据
        //Optional<> apply(T t)
//        Optional<String> opp=
//                op.flatMap(x->Optional.of(x+"_briup"));
//        System.out.println(opp.get());
        //Optional中没有值返回空对象，
        //有值值交给function函数处理（自己定义的
        // 表达式处理，把处理结果装回到Optional对象中返回）
//        Optional<List<String>> li= op.map(x->{
//            List<String> list=new ArrayList<>();
//            list.add(x);
//            return list;
//        });
//        List<String> ar=li.get();
//        System.out.println(ar);
        //没有参数直接抛出异常
//        String oop=op.orElseThrow(Exception::new);
//        String oop1=op1.orElseThrow(()->new Exception());
//        System.out.println(oop);
//        System.out.println(oop1);
//        String oop=op.orElseThrow(()->new Exception("没值"));
//        String oop1=op1.orElseThrow(()->new Exception("没值"));
//        System.out.println(oop);
//        System.out.println(oop1);
        //Optional有值获取值，
        //没有值取默认值，执行的是参数中的lambda表达式
//        String oop=op.orElseGet(()->"没值");
//        String oop1=op1.orElseGet(()->"没值");
//        System.out.println(oop);
//        System.out.println(oop1);
        //orElse参数是默认值，Optional有值获取值，
        //没有值取默认值
//        System.out.println(op.orElse("没值"));
//        System.out.println(op1.orElse("没值"));
        //取值，有值直接获取，没值报错
//        System.out.println(op.get());
//        System.out.println(op1.get());
        //有值执行方法中的lambda表达式
//        op1.ifPresent(x-> System.out.println(x+"*"));
        //是否值有真实值，真实的结果true，数据是
        //null结果是false
//        System.out.println(op.isPresent());
//        System.out.println(op1.isPresent());

    }
}
