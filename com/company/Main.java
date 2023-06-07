package com.company;

import com.company.Queue.StackQueue;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        StackQueue queue = new StackQueue();
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

    }
}
