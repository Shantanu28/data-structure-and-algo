package com.datastructure.algo.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int intArray[] = { 20, 35, -15, 22, 55, 23, 10 };

        bubbleSort(intArray);

        for (int arr : intArray) {
            System.out.println(arr);
        }
    }

    private static void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            for (int index = 0; index <= lastUnsortedIndex - 1; index++) {
                if (intArray[index] > intArray[index + 1]) {
                    swap(intArray, index, index + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
