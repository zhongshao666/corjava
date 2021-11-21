package com.briup.exercise8;

public class Test_stack_queue {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("123");
        myStack.push("456");
        myStack.push("789");

        System.out.println(myStack.index);

        System.out.println(myStack.pop());
        myStack.push("999");
        System.out.println(myStack.index);
        myStack.push("000");
        System.out.println(myStack.index);
        myStack.push("111");
        System.out.println(myStack.index);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("以下为队列");
        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.push(3.6);
        myQueue.push(3.7);
        myQueue.push(3.8);
        System.out.println(myQueue.pop());
        myQueue.push(6.6);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}
