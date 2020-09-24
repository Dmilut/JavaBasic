package com.dmilut.lesson_16.homework.homeworkVika;

import java.util.Arrays;

public class HomeworkVika {

    public static void main(String[] args) {

        int[] array1 = {9, 4, 7, 2, 8, 1, 3, 5, 10, 6};

        descendingBubbleSort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {9, 4, 7, 2, 8, 1, 3, 5, 10, 6};

        bubbleSortUsingRecursion(array2, array2.length);
        System.out.println(Arrays.toString(array2));


        System.out.println(sumFibonacci(5, 8));

    }


    /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */
    public static void descendingBubbleSort(int[] array) {
        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }


    /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */
    public static void bubbleSortUsingRecursion(int[] array, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        bubbleSortUsingRecursion(array, n - 1);
    }


    /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона. Мой диапазон от 5 до 10 */
    public static int sumFibonacci(int startNumber, int endNumber) {
        int n0 = 5;
        int n1 = 6;
        int n2;

        int sum = 0;

        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 5; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }

        return sum;
    }
}








