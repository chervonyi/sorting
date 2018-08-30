package com.general;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        // Find middle position
        int mid = ((array.length + 1) / 2) - 1;

        // Sorting both halves
        int[] left = sort(Arrays.copyOfRange(array, 0, mid + 1));
        int[] right = sort(Arrays.copyOfRange(array, mid + 1, array.length));

        // Merging:
        int[] sortedArray = new int[left.length + right.length];
        int lPos = 0;
        int rPos = 0;
        int pos = 0;

        // Merge while left or right arrays have not-merged elements
        while (left.length + right.length > lPos + rPos) {
            if (lPos == left.length) {
                sortedArray[pos++] = right[rPos];
                if (rPos < right.length) {
                    rPos++;
                }
            } else if (rPos == right.length) {
                sortedArray[pos++] = left[lPos];
                if (lPos < left.length) {
                    lPos++;
                }
            } else {
                if (left[lPos] > right[rPos]) {
                    sortedArray[pos++] = right[rPos++];
                } else {
                    sortedArray[pos++] = left[lPos++];
                }
            }
        }
        return sortedArray;
    }
}
