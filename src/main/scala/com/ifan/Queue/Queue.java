package com.ifan.Queue;

/**
 * 待完成
 */

public class Queue {
    private int[] data;
    private int length;
    private int currLength;
    private int head;
    private int tail;

    public Queue(int k)
    {
        data = new int[k];
        for (int i = 0; i < k; i++)
        {
            data[i] = -1;
        }
        length = k;
        currLength = 0;
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (head == -1 && tail == -1) {
            data[++head] = value;
            ++tail;
            currLength++;
            return true;
        } else if (isFull()) {
            return false;
        } else {
            tail = (tail + 1) % length;
            data[tail] = value;
            currLength++;
            return true;
        }
    }

    public boolean deQueue() {
        if (head == -1 && tail == -1) {
            return false;
        } else if (isEmpty()) {
            return false;
        } else {
            data[head++] = -1;
            head = head % length;
            currLength--;
            return true;
        }
    }

    public int front() {
        return data[head];
    }

    public boolean isEmpty() {
        return currLength == 0;
    }

    public boolean isFull() {
        return currLength == length;
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(1);
        q.deQueue();
        q.enQueue(50);
        q.enQueue(60);
        System.out.println(q.currLength);

    }

}
