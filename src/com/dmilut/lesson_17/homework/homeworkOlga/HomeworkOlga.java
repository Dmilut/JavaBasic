package com.dmilut.lesson_17.homework.homeworkOlga;

import java.util.Random;

public class HomeworkOlga {
    /* TODO: 9/21/20
        1.1. Провести отладку (дебагинг) метода quickSort из класса Lesson. Детально разобраться как он работает */
    //Done

    /* TODO: 9/21/20
        2.1. Используя подход "разделяй и властвуй" написать метод для поиска произвольного числа в массиве */

    public static void main(String[] args) {

        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = Math.abs(new Random().nextInt(50));
        }

        printArray(testArray);
        quickSort(testArray, 0, testArray.length - 1);
        printArray(testArray);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (right - left >= 0) {
            int pivotIndex = left + new Random().nextInt(right - left + 1);
            swap(array, pivotIndex, right);

            int pivot = array[right];
            int partition = division(array, left, right, pivot);

            quickSort(array, left, partition - 1);
            quickSort(array, partition + 1, right);
        }
    }

    private static int division(int[] array, int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;

        while (true) {

            do {
                leftPtr++;
            }
            while (array[leftPtr] < pivot);

            do {
                rightPtr--;
            }
            while (rightPtr > 0 && array[rightPtr] > pivot);

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(array, leftPtr, rightPtr);
            }
        }

        swap(array, leftPtr, right);

        return leftPtr;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}












