package com.homework.nix.library.util;

public class MergeSort {

    public static int [] mergeArray(int [] arrayLeft, int [] arrayRight) {
        int[] arrayResult = new int[arrayLeft.length + arrayRight.length];
        int i = 0, j = 0;
        for (int k = 0; k < arrayResult.length; k++) {
            if (i > arrayLeft.length-1) {
                int a = arrayRight[j];
                arrayResult[k] = a;
                j++;
            }
            else if (j > arrayRight.length-1) {
                int a = arrayLeft[i];
                arrayResult[k] = a;
                i++;
            }
            else if (arrayLeft[i] < arrayRight[j]) {
                int a = arrayLeft[i];
                arrayResult[k] = a;
                i++;
            }
            else {
                int b = arrayRight[j];
                arrayResult[k] = b;
                j++;
            }
        }
        return arrayResult;
    }

    public static int[] sortMergeArray(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int [] arrayLeft = new int[arr.length / 2];
        System.arraycopy(arr, 0, arrayLeft, 0, arr.length / 2);

        int [] arrayRight = new int[arr.length - arr.length / 2];
        System.arraycopy(arr, arr.length / 2, arrayRight, 0, arr.length - arr.length / 2);


        arrayLeft = sortMergeArray(arrayLeft);
        arrayRight = sortMergeArray(arrayRight);

        return mergeArray(arrayLeft, arrayRight);
    }
}
