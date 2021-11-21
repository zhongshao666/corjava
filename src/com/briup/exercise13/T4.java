package com.briup.exercise13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class T4 {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        String line;
        String[] arr1;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/briup/exercise13/T4file"));
        while (bufferedReader.ready()){
            line= bufferedReader.readLine();
            System.out.println("line = " + line);
            arr1=line.split("\\."); //   "[.]"也行

            map.put(Integer.valueOf(arr1[0]),arr1[1]);
        }
        int i=1;
        for (Integer key:map.keySet()
             ) {
            System.out.println(i+"."+map.get(key));
            i++;
        }

    }
}
