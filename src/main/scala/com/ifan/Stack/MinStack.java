package com.ifan.Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int tmp = stack.peek();
            if (tmp < x) {
                stack.push(x);
                stack.push(tmp);
            } else {
                stack.push(x);
                stack.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2 );
    }

    public int getMin() {
        return stack.peek();
    }



}
