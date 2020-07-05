package util;

public class MergeSort {

    public static void mergeArray(int [] arrayLeft, int [] arrayRight) {
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

    }
}
