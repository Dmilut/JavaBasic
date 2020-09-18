package com.dmilut.lesson_16.homework.homeworkIryna;

import java.util.Arrays;

public class HomeworkIryna {

    public static void main(String[] args) {

        //getFibonacciSum(3,5);
        System.out.println(getFibonacciSum(4, 24));
        /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */



    /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */

    /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона */


    }

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







