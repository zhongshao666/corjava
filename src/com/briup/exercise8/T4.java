package com.briup.exercise8;

import org.w3c.dom.ls.LSException;

import java.util.*;

public class T4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        list.add("bcd");
        list.add("cde");
        list.add("aex");

        char[] strArr1;
        Map<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            strArr1 = s.toCharArray();
            for (char c : strArr1) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else for (char key : map.keySet()) {
                    if (key == c) {
                        Integer value = map.get(key);
                        map.put(key, value + 1);
                    }
                }

            }
        }

        for (char key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
    }
}
