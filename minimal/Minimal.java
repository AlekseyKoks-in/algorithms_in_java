package com.alex.algorithms.minimal;

import java.util.Arrays;

public class Minimal {
    public static void main(String[] args) {
        int[] array = new int[13];
        fillTheArray(array);
        System.out.println(Arrays.toString(array));
        min(array);

    }

    public static int[] fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 99);
        }
        return array;
    }

    public static void min(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.printf("Minimal value = %d, minimal index = %d\n", minValue, minIndex);
    }
}
