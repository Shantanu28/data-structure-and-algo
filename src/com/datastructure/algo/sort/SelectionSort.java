package com.datastructure.algo.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        selectionSortAlgo(intArray);

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    private static void selectionSortAlgo(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int index = 1; index <= lastUnsortedIndex; index++) {
                if (intArray[index] > intArray[largest]) {
                    largest = index;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }
    }

    private static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
