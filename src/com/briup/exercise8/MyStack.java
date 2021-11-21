package com.briup.exercise8;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    int index=0;
    List<T> list= new ArrayList<>();

    void push(T o){
        index++;
        list.add(o);
    }
    Object pop(){
        if(!list.isEmpty()){
            index--;
            return list.remove(index);
        }
        return 0;
    }

}
