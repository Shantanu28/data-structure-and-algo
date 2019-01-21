package com.datastructure.algo.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertionSortAlgo(intArray);

        for (int arr: intArray) {
            System.out.println(arr);
        }
    }

    private static void insertionSortAlgo(int[] intArray) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int index;

            for (index = firstUnsortedIndex; index > 0 && intArray[index - 1] > newElement; index--) {
                intArray[index] = intArray[index - 1];
            }

            intArray[index] = newElement;
        }
    }
}
