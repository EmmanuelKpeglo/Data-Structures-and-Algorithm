package com.company.Queue;

import java.util.Stack;

public class StackQueue  {
    private final Stack<Integer> firstStack = new Stack<>();
    private final Stack<Integer> secondStack = new Stack<>();

    public void enqueue(int item) {
        firstStack.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw  new IllegalStateException();
        }

        moveFirstStackToSecondStack();

        return secondStack.pop();
    }

    public int peek() {
        if (firstStack.empty()) {
            throw  new IllegalStateException();
        }

        moveFirstStackToSecondStack();

        return secondStack.peek();
    }

    private void moveFirstStackToSecondStack() {
        if (secondStack.empty()) {
            while (!firstStack.empty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return firstStack.empty() && secondStack.empty();
    }
}
