package com.general;

public class SelectionSort {
    public int[] sort(int[] array) {
        int tmp, min;

        for (int i = 0, n = array.length; i < n - 1; i++) {
            min = i;
            // Searching for min element in right (not-sorted) part of array
            for (int j = i + 1; j < n; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        return array;
    }
}
