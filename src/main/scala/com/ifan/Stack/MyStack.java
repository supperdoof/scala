package com.ifan.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyStack {
    private List<Integer> data;

    public MyStack() {
        data = new ArrayList<Integer>();
    }

    public void push(int value) {
        data.add(value);
    }

    public int top() {
        return data.get(data.size()-1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean pop() {
        if (isEmpty()) {
            return false;
        }

        data.remove(data.size()-1);
        return true;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }


    }


}
