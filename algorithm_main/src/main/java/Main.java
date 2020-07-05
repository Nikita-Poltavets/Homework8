import util.*;

public class Main {

    public static int[] getArray(){
        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        return ints;
    }

    public static void main(String[] args) {

        BubbleSort.bubbleSortAlgorithm(getArray());

        InsertionSort.insertionSortAlgorithm(getArray());

        MergeSort.mergeArray(getArray(), getArray());

        QuickSort.quickSortAlgorithm(getArray(), 0, getArray().length - 1);

        SelectionSort.sort(getArray());
    }

}
