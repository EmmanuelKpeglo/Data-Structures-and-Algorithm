package com.company;

import com.company.BinaryTree.BinaryTree;
import com.company.HashTables.CharacterFinder;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        System.out.println(tree.find(10));

    }
}
