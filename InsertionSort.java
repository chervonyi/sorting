package com.general;

public class InsertionSort {
    public int[] sort(int[] array) {
        int tmp;
        int j;
        // Taking next element and put it in appropriate place at the left-sorted part of array
        for (int i = 0; i < array.length - 1; i++) {
            j = i + 1;
            while (array[j] < array[j - 1]) {
                tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
                j--;

                // Exit from loop on the left border of array
                if (j == 0)
                    break;
            }
        }
        return array;
    }
}
