package com.company.BinaryTree;

public class BinaryTree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var currentNode = root;

        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    break;
                }
                currentNode = currentNode.left;

            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    break;
                }
                currentNode = currentNode.right;
            }

        }
    }

    public boolean find(int value) {
        var node = new Node(value);

        if (root == null) return false;

        var currentNode = root;

        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value){
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }

        return false;
    }
}
