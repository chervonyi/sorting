package com.general;

public class Main {

    public static void main(String[] args) {
	    int[] notSorted = new int[]{12, 3, 6, 10, 1, 2, 10, 8, 17, 15, 11};

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();

        printArray(mergeSort.sort(notSorted));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
