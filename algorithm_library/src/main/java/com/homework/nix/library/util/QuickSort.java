package com.homework.nix.library.util;

public class QuickSort {

    public static void quickSortAlgorithm(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

                int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSortAlgorithm(array, low, j);

        if (high > i)
            quickSortAlgorithm(array, i, high);
    }
}
