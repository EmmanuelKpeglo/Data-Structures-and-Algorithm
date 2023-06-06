package com.company;

import com.company.Queue.ArrayQueue;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        ArrayQueue queue = new ArrayQueue(3);
        System.out.println(queue.isFull());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        System.out.println(queue.isFull());
        queue.enqueue(30);
        System.out.println(queue.isFull());
        System.out.println(queue);
    }
}
