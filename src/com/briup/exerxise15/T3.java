package com.briup.exerxise15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("src/com/briup/exerxise15/word.txt"));
            int len;
            StringBuilder str = new StringBuilder();
            while ((len = isr.read()) != -1) {
                str.append((char) len);
            }
            String[] strings = str.toString().split("\\W+");
            Map<String, Integer> map = new HashMap<>();
            for (String s : strings
            ) {
                if (map.containsKey(s)) {
//                    Integer count = map.get(s);
                    map.put(s, map.get(s)+1);
                } else
                    map.put(s, 1);
            }
            for (String key : map.keySet()) {
                System.out.println(key + ":" + map.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
