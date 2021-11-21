package com.briup.exercise1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x={2,5,8,3,6,9,1,4,7};
        x=bubbleSort(x,x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    static int[] bubbleSort(int[] x,int y){
        int m;
        for (int i=0;i<y;i++)
            for (int j=i;j<y;j++){
                if (x[i]>x[j]){
                    m=x[i];
                    x[i]=x[j];
                    x[j]=m;
                }
            }
        return x;
    }
}
