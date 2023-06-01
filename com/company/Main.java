package com.company;

import com.company.Stacks.BalancedExpression;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        BalancedExpression checkExpression = new BalancedExpression();
        var isBalanced = checkExpression.isBalanced("(){}<>[]");
        System.out.println(isBalanced);
    }
}
