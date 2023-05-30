package com.company.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public void addLast(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        }
        else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void addFirst(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }
        else {
            newNode.next = first;
            first = newNode;
        }
        size++;

    }

    public int indexOf(int item) {
        int count = 0;
        Node currentNode = first;

        while (currentNode != null) {
            if (currentNode.data == item) {
                return count;
            }
            currentNode = currentNode.next;
            count++;
        }

        return -1;
    }

    public boolean contains(int item)  {
        Node currentNode = first;

        while (currentNode != null) {
            if (currentNode.data == item) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;

        //OR
//        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        else {
            Node oldFirst = first;
            first = first.next;
            oldFirst.next = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            last = getPrevious(last);
            last.next = null;
        }
        size--;

    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node currentNode = first;
        int index = 0;
        while (currentNode != null) {
            array[index++] = currentNode.data;
            currentNode = currentNode.next;
        }

        return array;
    }

//    public void reverse() {
//        var array = this.toArray();
//        var index = size - 1;
//        var currentNode = first;
//        while (currentNode != null) {
//            currentNode.data = array[index--];
//            currentNode = currentNode.next;
//        }
//    }
    public void reverse() {
        if (isEmpty()) {
            return;
        }

        Node previousNode = first;
        Node currentNode = first.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        last = first;
        first = previousNode;
        last.next = null;
    }

    public int getKThFromTheEnd (int KTh) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if (KTh <= 0) {
            throw new IllegalArgumentException();
        }
        Node potentialKThNode = first;
        Node potentialLastNode = first;
        for (int count = 1; count < KTh; count++) {
            potentialLastNode = potentialLastNode.next;
            if (potentialLastNode.next == null) {
                throw new IllegalArgumentException("Argument is greater than size of list");
            }
        }

        while (potentialLastNode != last) {
            potentialLastNode = potentialLastNode.next;
            potentialKThNode = potentialKThNode.next;
        }

        return potentialKThNode.data;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node last) {
        Node current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }

        return null;
    }
}
