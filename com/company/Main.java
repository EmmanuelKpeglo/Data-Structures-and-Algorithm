package com.company;

import com.company.Stacks.StringReverser;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        var input = "hello world";
        var reverser = new StringReverser();
        System.out.println(reverser.reverse(input));
    }
}
