package com.company;

import com.company.Arrays.Array;
import com.company.LinkedList.LinkedList;
import com.company.Stacks.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        var input = "hello world";
        var reverser = new StringReverser();
        System.out.println(reverser.reverse(input));
    }
}
