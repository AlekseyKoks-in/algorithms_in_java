package com.alex.algorithms.bubble_sort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] array = new int[13];
        fillTheArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        myBubbleSort(array);

    }

    public static int[] fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 99);
        }
        return array;
    }

    public static void myBubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
