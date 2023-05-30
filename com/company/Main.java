package com.company;

import com.company.Arrays.Array;
import com.company.LinkedList.LinkedList;
import com.company.Stacks.Stacks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        var stack = new Stacks();
        stack.push(4);
        stack.push(8);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        var eight = stack.pop();
        var four = stack.pop();
        System.out.println(eight);
        System.out.println(four);
        System.out.println(stack.empty());
    }
}
