package com.briup.exercise9;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSet111 {
    public static void main(String[] args) {
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        for (Color color : enumSet) {
            System.out.println(color);
        }



    }
}
