package com.company;

import com.company.Arrays.Array;
import com.company.Stacks.BalancedExpression;
import com.company.Stacks.StackWithArray;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        StackWithArray stackWithArray = new StackWithArray(3);
        stackWithArray.push(8);
        stackWithArray.push(5);
        stackWithArray.push(9);
        stackWithArray.push(3);
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        stackWithArray.push(1);
        stackWithArray.push(7);
        System.out.println(stackWithArray.empty());
        System.out.println(stackWithArray.peek());
        System.out.println(stackWithArray);

    }
}
