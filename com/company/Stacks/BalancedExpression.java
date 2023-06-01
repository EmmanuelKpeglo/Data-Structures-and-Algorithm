package com.company.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char character : expression.toCharArray()) {
            if (isLeftBracket(character)) {
                stack.push(character);
            }
            if (isRightBracket(character)) {
                if (stack.empty()) return false;

                if (!isBracketMatch(stack.pop(), character)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char bracket) {
        return leftBrackets.contains(bracket);
    }

    private boolean isRightBracket(char bracket) {
        return rightBrackets.contains(bracket);
    }

    private boolean isBracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
