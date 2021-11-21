package com.briup.exercise8;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {
    int index=0;
    List<T> list= new ArrayList<>();

    void push(T o){
        index++;
        list.add(o);
    }
    Object pop(){
        if(!list.isEmpty()){
            index--;
            return list.remove(0);
        }
        return 0;
    }
}
