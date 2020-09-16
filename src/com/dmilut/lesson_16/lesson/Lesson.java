package com.dmilut.lesson_16.lesson;

import java.util.Arrays;

public class Lesson {

    public static void main(String[] args) {
        int[] testArray = {0, 12, 5, 11, };

        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    // Bbubble sort сложность O(n^2)
    private static void bubbleSort(int[] array) {
        boolean isSorted = false;

        int buf;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }

}
