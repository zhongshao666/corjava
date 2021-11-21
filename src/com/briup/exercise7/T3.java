package com.briup.exercise7;

import java.util.HashSet;
import java.util.Set;

public class T3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();//  ctrl + shift + enter
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet.add("zhangshan");
        hashSet.add("lisi");
        hashSet.add("fawaikuangtu");
        hashSet.add("xiaoyaofawai");
        hashSet1.add("lisi");
        hashSet1.add("fawaikuangtu");
        hashSet1.add("zhuangbizai");
        for (String str :hashSet) {
            if(hashSet1.contains(str))
                System.out.println(str);
        }
    }
}
