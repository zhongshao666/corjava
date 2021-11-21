package com.briup.jdk.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String,String> map=
                new HashMap<>();
        map.put("1","test1");
        map.put("2","test2");
        map.put("3","test3");
        map.put("4","test4");
        map.put("5",null);
        map.replaceAll((k,v)->v+"_briup");
        //键（第一个参数）和值（第二个参数）在map中必须都存在
        // ，在替换（第三个参数）
//        map.replace("3","test3","briup");
        //键和值存在的情况，直接替换值
//        map.replace("3","tom");
        //设置值，如果键对应的值不为空，不插入，
        //键对应的值为空插入数据
//        map.putIfAbsent("5","tom");
        //基于键取值，取值为null，返回第二个参数默认值
        //基于键取值，取值为不为null，基于取到的值和默认值
        //产生新的值，产生的新值为null删除，产生的新值不为null
        //插入键值
//        String val=map.merge("1","tom",
//                (oldV,defaultV)->oldV+"--"+defaultV);
//        String val=map.merge("1","tom",
//                (oldV,defaultV)->null);
//        System.out.println("new value:"+val);
        //有值返回值(包含赋值null)，没值返回默认值
//        String val=map.getOrDefault("6","tom");
//        System.out.println("new value:"+val);
        //1，直接基于key取值，取值为null直接返回null值
        //2.直接基于key取值,有真实值,基于键和值产生新的值
        //新的值不为null插入覆盖值操作，新的值为null删除键值对
//        String val=map.computeIfPresent("1",(k,v)->v+"_briup");
//        String val=map.computeIfPresent("1",(k,v)->null);
//        System.out.println("new value:"+val);
        //如果键对应的值存在，直接返回值
        //如果键对应的值为null，基于键产生新的value，并且插入到map中
//        String val=map.computeIfAbsent("5",x->x+"_briup");
//        System.out.println("new value:"+val);
        //键存在，计算的新值不为空，覆盖原有的键对应的值
        //键存在，计算的新值为空，删除原有的键值
        //键不存在，计算的新值不为空，插入新的键值对
        //          计算的新值为空，返回null并且不插入
        //String val=map.compute("1",(k,v)->v+"_briup");
//        String val=map.compute("1",(k,v)->null);
//        String val=map.compute("8",(k,v)->null);
//        System.out.println("new value:"+val);
//        //遍历
        map.forEach((k,v)->
                System.out.println(k+"--"+v));
        /*
        V oldValue = get(key);

        V newValue = remappingFunction.apply(key, oldValue);//test1_briup
        if (newValue == null) {
            // delete mapping
            if (oldValue != null || containsKey(key)) {
                // something to remove
                remove(key);
                return null;
            } else {
                // nothing to do. Leave things as they were.
                return null;
            }
        } else {
            // add or replace old mapping
            put(key, newValue);
            return newValue;
        }
         */

    }
}
