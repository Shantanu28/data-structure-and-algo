package com.datastructure.algo.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSortAlgo(intArray,  0, intArray.length);

        for (int arr: intArray) {
            System.out.println(arr);
        }
    }

    private static void mergeSortAlgo(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortAlgo(intArray, start, mid);
        mergeSortAlgo(intArray, mid, end);
        merge(intArray, start, mid, end);
    }

    private static void merge(int[] intArray, int start, int mid, int end) {
        if (intArray[mid - 1] <= intArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
        }

        System.arraycopy(intArray, i, intArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }
}
