package com.company.Stacks;


import java.util.LinkedList;

public class Stacks {
    private final LinkedList<Integer> stack = new LinkedList<>();

    public void push(int item) {
        stack.addFirst(item);
    }

    public int pop() {
        return stack.removeFirst();
    }

    public int peek() {
        return stack.getFirst();
    }

    public boolean empty() {
        return stack.size() == 0;
    }
}
