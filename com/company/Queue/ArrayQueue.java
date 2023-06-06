package com.company.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int frontIndex = 0;
    private int backIndex = 0;
    private int count = 0;

    public ArrayQueue(int size) {
        queue = new int[size];
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        queue[backIndex] = item;
        backIndex = (backIndex + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int itemDequeued = queue[frontIndex];
        queue[frontIndex] = 0;
        frontIndex = (frontIndex + 1) % queue.length;
        count--;

        return itemDequeued;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return queue[frontIndex];
    }

    public boolean isEmpty() {
        return frontIndex == count;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(queue, 0, count));
    }
}
