package com.company.Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        var splittedString = input.split("");
        Stack<String> stack = new Stack<>();
        for (int count = 0; count < splittedString.length; count++) {
            stack.push(splittedString[count]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}
