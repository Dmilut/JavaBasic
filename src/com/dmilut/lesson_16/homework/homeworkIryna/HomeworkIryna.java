package com.dmilut.lesson_16.homework.homeworkIryna;

import java.util.Arrays;

import static com.dmilut.lesson_16.lesson.Lesson.bubbleSort;

public class HomeworkIryna {

    public static void main(String[] args) {

        int[] testArray = {110, 30, 40, 50, 60, 20, 70, 80, 90, 100};

        bubbleSortDes(testArray);
        System.out.println(Arrays.toString(testArray));

        recBubbleSort(testArray, testArray.length);
        System.out.println(Arrays.toString(testArray));

        //getFibonacciSum(3,5);
        System.out.println(getFibonacciSum(2, 4));
    }

    /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */
    public static void bubbleSortDes(int[] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;

            for (int i = 100; i > array.length; i--) {
                for (int j = 1; j > array.length - 1; j--)
                    if (array[j] > array[j + 1]) {
                        isSorted = false;

                        // Swap
                        temp = array[j - 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
            }
        }

    }

    /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */
    static void recBubbleSort(int[] array, int length) {
        if (length == 1)
            return;
        for (int i = 0; i < length - 1; i++)
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        recBubbleSort(array, length - 1);

    }


    /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона */
    public static int getFibonacciSum(int start, int finish) {
        if (finish >= 25) {
            return -1;
        }
        int prev = 0;
        int next = 1;
        int current;
        int sum = 0;

        int[] fibonacciNumbers = new int[finish];
        fibonacciNumbers[0] = prev;
        fibonacciNumbers[1] = next;

        for (int i = 2; i < finish; i++) {
            current = prev + next;
            prev = next;
            next = current;
            fibonacciNumbers[i] = current;
        }
        for (int j = start - 1; j < finish; j++) {
            sum = sum + fibonacciNumbers[j];
        }
        System.out.println(Arrays.toString(fibonacciNumbers));
        return sum;

    }

}







