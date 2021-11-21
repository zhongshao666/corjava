package com.briup.jdk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
 */
public class LambdaTest8 {
    public static void main(String[] args) {
//        Predicate<String> eq=Predicate.isEqual("java");
        //object -> "java".equals(object)
//        eq.test("tom");
//        Predicate<String> pr1=t->t.length()>3;
//        Predicate<String> pr2=x->x.startsWith("J");
//        Predicate<String> pr3=x->x.endsWith("5");
//        Predicate<String> orPre=pr1.or(pr2);
//        boolean re=orPre.test("java");//true

//        Predicate<String> nn=pr1.negate();
//        nn.test("java");
//
//        Predicate<String> result=pr1.and(pr2);
//        boolean b=result.test("java");
//        System.out.println(b);
//        boolean b=pr1.and(pr2).and(pr3).test("test");

//        boolean b=pr1.test("ja");
//        System.out.println(b);
        List<String> list= Arrays.asList("Java","JavaScript",
                "Hadoop","Mysql","Hbase","Flume","Kafka",
                "Zookeeper");
//        filter(list,x->x.length()>6);
//        filter(list,x->x.startsWith("J"));
//        filter(list,x->x.endsWith("r"));
//        filter(list,x->true);
//        filter(list,x->false);
        Predicate<String> pr=x->x.length()>6;
        Predicate<String> pr1=x->x.startsWith("J");
//        filter(list,pr.and(pr1));
//        filter(list,pr.or(pr1));
        filter(list,Predicate.isEqual("Java"));
    }
    public static void filter(List<String> list,
                              Predicate<String> condition){
        for(String str:list){
            if(condition.test(str)){
                System.out.println(str);
            }
        }
    }
}
