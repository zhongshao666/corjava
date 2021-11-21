package com.briup.exercise3;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 6, 3, 8, 5, 2, 7, 4, 1};
        insertionSort(a);
        for (int m : a
        ) {
            System.out.println(m);
        }
    }

    public static void insertionSort(int[] x) {  //扑克排序
        int j;
        for (int i = 1; i < x.length; i++) {
            int key = x[i]; //目标牌
            j = i - 1;
            while (j >=0  && key < x[j]) {
                x[j + 1] = x[j]; //大牌一直后移
                x[j] = key; //目标牌比大牌小牌往前插
                j -= 1;
            }
        }



    }
}
