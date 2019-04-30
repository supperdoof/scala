package com.ifan.Queue;

public class CircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public CircularQueue(int k) {
        data = new int[k];
        size = k;
        head = -1;
        tail = - 1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            head = 0;
        }

        tail = (tail + 1) % size;
        data[tail] = value;
        return true;

    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            data[head] = 0;
            head = -1;
            tail = -1;
            return true;
        }

        data[head] = 0;
        head = (head + 1) % size;
        return true;

    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[tail];
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);

        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.deQueue();
        circularQueue.deQueue();
        System.out.println(circularQueue.Front());
        System.out.println(circularQueue.Rear());
    }
}
