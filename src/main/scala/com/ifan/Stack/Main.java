package com.ifan.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!");
        }

        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
