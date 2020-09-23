package com.dmilut.lesson_16.homework.homeworkVahe;

import java.util.Arrays;

public class HomeworkVahe {

    public static void main(String[] args) {

        int[] intArray = {5, 90, 35, 45, 150, 3, 123, 74, 66};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        bubbleSort(intArray);

        System.out.println("\nThe array after bubble sort by descending order is:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        int[] myArray = {5, 90, 35, 45, 150, 3, 123, 74, 66};
        recBubbleSort(myArray, myArray.length);
        System.out.println("\nThe array after recursive bubble sort is ");
        System.out.println(Arrays.toString(myArray));

        int start = 1;
        int end = 10;
        System.out.println("\nThe Fibonacci sequence sum from " + start + " to " + end
                + " considering 0 is the first element is: " + sumFibonacci(start - 1, end - 1));
    }

    /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */
    public static void bubbleSort(int[] array) {

        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] < array[j]) {

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */
    public static void recBubbleSort(int[] array, int lenArray) {
        if (lenArray == 1)
            return;
        for (int i = 0; i < lenArray - 1; i++) {
            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            recBubbleSort(array, lenArray - 1);
        }
    }

    /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона */
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int sumFibonacci(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++)
            sum += fib(i);

        return sum;
    }
}














