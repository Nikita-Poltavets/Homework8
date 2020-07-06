package com.homework.nix.main;

import com.homework.nix.library.util.*;

import java.util.*;

public class Main {

    public static int[] getArray(){
        int[] ints = new int[10000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        return ints;
    }

    public static void algrorithms(){
        long startTime;
       Map<Long, String> map = new HashMap<>();


        startTime = System.nanoTime();
        BubbleSort.bubbleSortAlgorithm(getArray());
        map.put(System.nanoTime() - startTime, "Bubble sort");

        startTime = System.nanoTime();
        InsertionSort.insertionSortAlgorithm(getArray());
        map.put(System.nanoTime() - startTime, "Insertion sort");

        startTime = System.nanoTime();
        MergeSort.mergeArray(Arrays.copyOfRange(getArray(), 0, getArray().length / 2), Arrays.copyOfRange(getArray(), getArray().length / 2, getArray().length));
        map.put(System.nanoTime() - startTime, "Merge sort");

        startTime = System.nanoTime();
        QuickSort.quickSortAlgorithm(getArray(), 0, getArray().length - 1);
        map.put(System.nanoTime() - startTime, "Quick sort");

        startTime = System.nanoTime();
        SelectionSort.sort(getArray());
        map.put(System.nanoTime() - startTime, "Selection sort");

        startTime = System.nanoTime();
        ShellSort.sort(getArray());
        map.put(System.nanoTime() - startTime, "Shell sort");

        startTime = System.nanoTime();
        ShuttleSort.shuttleSort(getArray());
        map.put(System.nanoTime() - startTime, "Shuttle sort");

        Map<Long, String> sortedMap = new TreeMap<>(map);

        for(Map.Entry<Long, String> pair : sortedMap.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        algrorithms();
    }

}
