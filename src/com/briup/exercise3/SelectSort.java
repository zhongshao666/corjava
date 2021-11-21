package com.briup.exercise3;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {9, 6, 3, 8, 5, 2, 7, 4, 1};
        selectSort(a);
        for (int m : a
        ) {
            System.out.println(m);
        }
    }

    public static void selectSort(int[] x){
        int i,k,smallest,temp;
        for(i=0;i<x.length-1;i++){
            smallest=i;
            for ( k = i+1; k <x.length ; k++) {
                if (x[k]<x[smallest]){
                    smallest=k;
                }
            }
            if (i!=smallest) {
                temp = x[smallest];
                x[smallest] = x[i];
                x[i] = temp;
            }
        }
    }
}
