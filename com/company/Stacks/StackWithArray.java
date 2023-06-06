package com.company.Stacks;

import java.util.Arrays;

public class StackWithArray {
    private int[] stack;
    private int highestIndex = 0;
    private int stackLength;

    public StackWithArray(int initialSize) {
        this.stack = new int[initialSize];
        stackLength = stack.length;
    }

    public void push(int item) {
        if (isFull()) {
            int[] temporaryArray = new int[highestIndex * 2];
            for (int index = 0; index < highestIndex; index++) {
                temporaryArray[index] = stack[index];
            }

            stack = temporaryArray;
            stackLength = stack.length;
        }

        stack[highestIndex] = item;
        highestIndex++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return stack[--highestIndex];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        return stack[highestIndex - 1];
    }

    public boolean empty() {
        return isEmpty();
    }

    private boolean isFull() {
        return  highestIndex == stackLength;
    }

    private boolean isEmpty() {
        return highestIndex == 0;
    }

    @Override
    public String toString() {
        var items =  Arrays.copyOfRange(stack, 0, highestIndex);
        return Arrays.toString(items);
    }
}
