package com.dmilut.lesson_16.homework.homeworkIryna;

import java.util.Arrays;

import static com.dmilut.lesson_16.lesson.Lesson.bubbleSort;

public class HomeworkIryna {

    public static void main(String[] args) {

        int[] testArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        bubbleSortDes(testArray);
        System.out.println(Arrays.toString(testArray));

        //getFibonacciSum(3,5);
        System.out.println(getFibonacciSum(4, 24));
    }


    /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */
    public static void bubbleSortDes(int[] testArray) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;


            for (int i = 100; i > testArray.length; i--) {
                for (int j = 1; j > testArray.length - 1; j--)
                    if (testArray[j] > testArray[j + 1]) {
                        isSorted = false;

                        // Swap
                        temp = testArray[j - 1];
                        testArray[j + 1] = testArray[j];
                        testArray[j] = temp;
                    }
            }

        }

    }

/* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */

    static void recBubbleSort(int my_arr2[], int len_arr) {
        if (len_arr == 1)
            return;
        for (int i = 0; i < len_arr - 1; i++)
            if (my_arr2[i] > my_arr2[i + 1]) {
                int temp = my_arr2[i];
                my_arr2[i] = my_arr2[i + 1];
                my_arr2[i + 1] = temp;
            }
        recBubbleSort(my_arr2, len_arr - 1);

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







