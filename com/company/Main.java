package com.company;

import com.company.Arrays.Array;
import com.company.LinkedList.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LinkedList list = new LinkedList();
        list.addLast(6);
        list.addLast(7);
        list.addLast(2);
        list.addLast(1);
        list.addLast(5);
        list.addFirst(3);
        list.addFirst(9);

        list.removeLast();
        list.removeFirst();

        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        list.reverse();
        var array2 = list.toArray();
        System.out.println(Arrays.toString(array2));
        System.out.println("reversed");
        System.out.println(list.getKThFromTheEnd(3));
        System.out.println(list.size());
    }
}
