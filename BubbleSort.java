package com.general;

public class BubbleSort {
    public int[] sort(int[] array) {
        int tmp;
        for (int i = 0, n = array.length; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }
}
