package com.briup.exercise8;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "阿牛哥");
        map.put(4, "灭绝师太");
        Set<Map.Entry<Integer, String>> set=map.entrySet();
        System.out.println("遍历方法一：");
        for (Map.Entry<Integer,String> map1:set
             ) {
            System.out.println(map1.getKey()+","+map1.getValue());
        }
        System.out.println("遍历方法二：");
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> map2=iterator.next();
            System.out.println(map2.getKey()+","+map2.getValue());
        }
        System.out.println("遍历方法三：");

        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("-------------");
        System.out.println("增加");
        map.put(5,"李小红");
        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("--------------");
        System.out.println("删除");
        map.remove(1);
        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("--------------");
        System.out.println("修改");
        System.out.println("二次put覆盖");
        map.put(2,"赵敏");
        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("replace方法");
        map.replace(2, "赵敏111");
        for (Integer key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
    }
}
