package com.briup.Comment;

public class Opera {
    public static void main(String[] args) {
        //字符串和8钟基本类型拼接都转换为为字符串，然后拼接
        System.out.println("1"+1);
        System.out.println("1"+1.1);
        System.out.println("1"+true);

        System.out.println(1+12L);  //为long类型
        System.out.println(1*2.20);
        System.out.println("取整");
        //取整
        System.out.println(13/2); //6
        System.out.println(13D/2);  //6.5   D为double

        System.out.println("移位");
        //  >>右移
        System.out.println(12>>2);
        //0000 1100  >>   0000 0011
        System.out.println(-3<<2);//取反加一 再移位  然后再取反加一  左移补0

        System.out.println("-------");
        System.out.println(5&4);
        //  101    相同为1不同为0
        //  100   -->100  = 4
        System.out.println("异或  ^");
        System.out.println(1^0);//相同为0，不同为1
        System.out.println(1^1);
        System.out.println("取反");
        System.out.println(~5);  //-6
        // 0000 0000 0000 0000 0000 0000 0000 0101   5
        // 1111 1111 1111 1111 1111 1111 1111 1010  为负数 取反加一得-6
        // 0000 0000 0000 0000 0000 0000 0000 0101   取反
        //+1
        //0000 0000 0000 0000 0000 0000 0000 0110  =6  改符号后为-6
        System.out.println("&&");
        System.out.println((3>2)&&(4>1));  //&&左右放表达式  不能放常量
        System.out.println("三目运算");
        //三目运算
        //(boolean)?true:false
        System.out.println((4>2)?666:777);
        System.out.println((4>5)?666:777);
        System.out.println("强转"); //小->大  隐式转换         大->小  显示转换
        byte a=(byte) 128;
        System.out.println(a);
        byte b=(byte) 129; //0000 0000              1000 0000超出范围 截断
        System.out.println(b);
    }
}
