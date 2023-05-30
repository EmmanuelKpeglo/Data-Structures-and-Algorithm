package com.company.Arrays;

public class Array {
    private int[] array;
    private int currentArraySize;
    private int highestIndex = 0;
    public Array(int arraySize) {
        this.array = new int[arraySize];
        this.currentArraySize = arraySize;
    }

    public void insert(int item) {
        if (highestIndex == currentArraySize) {
            int[] temporaryArray = new int[highestIndex * 2];
            for (int index = 0; index < highestIndex; index++) {
                temporaryArray[index] = array[index];
            }

            array = temporaryArray;
            currentArraySize = array.length;
        }

        this.array[highestIndex] = item;
        highestIndex++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= highestIndex) {
            throw new ArithmeticException();
        }

        for (int currentIndex = index; currentIndex < highestIndex; currentIndex++) {
            array[currentIndex] = array[currentIndex + 1];
        }

        highestIndex--;
    }

    public int indexOf(int item) {
        int index = -1;
        for (int currentIndex = 0; currentIndex < this.array.length; currentIndex++) {
            if (this.array[currentIndex] == item) {
                index = currentIndex;
                break;
            }
        }
        return index;
    }

    public void print() {
        for (int currentItem = 0; currentItem < highestIndex; currentItem++) {
            System.out.println(array[currentItem]);
        }
    }
}
