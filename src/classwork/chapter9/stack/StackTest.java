package classwork.chapter9.stack;

import homework.homework5.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Stack myStack2 = new Stack();
        myStack.push(11);
        myStack.push(22);
        myStack.push(33);
        myStack.push(44);
        myStack.push(55);


        System.out.println(myStack2.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
