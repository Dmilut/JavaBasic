package com.dmilut.lesson_16.lesson;

import java.util.Arrays;

public class Lesson {

    public static void main(String[] args) {

        int[] testArray = {0, 12, 5, 11, 17, 99};

        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));

        System.out.println(Arrays.toString(getFibonacciNumbers(10)));

        System.out.println(getFibonacciNumber(3));
    }

    // Bubble sort сложность O(n^2)
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;


            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    // Swap
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

        }
    }

    // Метод возвращает массив значений чисел Фибоначчи в заданном диапозоне
    public static int[] getFibonacciNumbers(int size) {
        int previousNumber = 0;
        int nextNumber = 1;
        int tempNumber;
        int[] array = new int[size];

        array[0] = previousNumber;
        array[1] = nextNumber;

        for (int i = 2; i < size; i++) {

            tempNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = tempNumber;

            array[i] = tempNumber;
        }

        return array;
    }

    // Метод возвращает значение числа Фибоначчи
    public static int getFibonacciNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
        }
    }

}
