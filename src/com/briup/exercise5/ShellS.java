package com.briup.exercise5;

public class ShellS {
    public static void main(String[] args) {
        int[] array={50,38,65,97,76,13,27,49,78,34,12,64,1};
        shellS(array);
        for (int i1 : array) {
            System.out.print(i1 + " ");
        }
/*        System.out.println();
        test1 test111=new test1();
        test111.te();*/

    }

    public static void shellS(int[] x){
        int gap=x.length/2;
        int temp;
        while (gap>1){
            for (int i = 0; i <gap ; i++) {

                for (int j=i+gap;j<x.length;j+=gap){
                    temp=x[j];
                    int k = j - gap;
                    while (k >= 0 && x[k] > temp) {
                        x[k + gap] = x[k];
                        k -= gap;
                    }
                    x[k + gap] = temp;
                }
            }
            gap/=2;
            System.out.println("gap = " + gap);
        }

    }

    public class test{
        private  int age;

        public test() {
        }

        public test(int age) {
            this.age = age;
        }

        public int getAge() {
//            System.out.println(this.age);
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

class test1{
    public void te(){
        ShellS.test t1= new ShellS().new test(16);
        int aa=t1.getAge();
        System.out.println("4444");
        System.out.println("5555");
        System.out.println(aa);
        System.out.println("6666");
    }
}
