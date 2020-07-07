package com.homework.nix.main;

import com.homework.nix.library.util.*;
import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static int[] getArray(){
        int[] ints = new int[10000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        return ints;
    }

    public static void algorithms(){
       long startTime;
       int i = 0;
       Map<Long, String> map = new HashMap<>();


        startTime = System.nanoTime();
        BubbleSort.bubbleSortAlgorithm(getArray());
        map.put(System.nanoTime() - startTime, "Bubble sort");

        startTime = System.nanoTime();
        InsertionSort.insertionSortAlgorithm(getArray());
        map.put(System.nanoTime() - startTime, "Insertion sort");

        startTime = System.nanoTime();
        MergeSort.sortMergeArray(getArray());
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

        for (int j = 0; j < 10; j++) {
            i = 0;
            for(Map.Entry<Long, String> pair : sortedMap.entrySet())
            {
                i++;
                logger.info(i + ") " + pair.getValue() + " - " + pair.getKey() + " Nanoseconds");
            }
            logger.info("\n\r");
        }

    }

    public static void main(String[] args) {
        algorithms();
    }

}
