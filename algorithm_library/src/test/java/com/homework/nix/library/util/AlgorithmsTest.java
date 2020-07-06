package com.homework.nix.library.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    int[] sortedArray = {41, 42, 43, 44, 45, 46, 47, 48};
    int[] unsortedArray = {42, 44, 41, 48, 45, 43, 46, 47};

    @Test
    void bubbleSortAlgorithm() {
        BubbleSort.bubbleSortAlgorithm(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    void insertionSortAlgorithm() {
        InsertionSort.insertionSortAlgorithm(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}