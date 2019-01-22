package com.datastructure.algo.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSortAlgo(intArray,  0, intArray.length);

        for (int arr: intArray) {
            System.out.println(arr);
        }
    }

    private static void quickSortAlgo(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int partitionIndex = partition(intArray, start, end);
        quickSortAlgo(intArray, start, partitionIndex);
        quickSortAlgo(intArray, partitionIndex + 1, end);

    }

    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && intArray[--j] >= pivot);
            if (i < j) {
                intArray[i] = intArray[j];
            }

            while (i < j  && intArray[++i] <= pivot);
            if (i < j) {
                intArray[j] = intArray[i];
            }
        }

        intArray[j] = pivot;

        return j;
    }




}
