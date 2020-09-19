package com.dmilut.lesson_16.homework.homeworkVahe;

import java.util.Arrays;

public class HomeworkVahe {

    public static void main(String[] args) {

        /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */

        int intArray[] = new int[]{5,90,35,45,150,3,123,74,66};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        bubbleSort(intArray);

        System.out.println("\nThe array after bubble sort by descending order is:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        int my_arr[] = {5,90,35,45,150,3,123,74,66};
        recBubbleSort(my_arr, my_arr.length);
        System.out.println("\nThe array after recursive bubble sort is ");
        System.out.println(Arrays.toString(my_arr));

        /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона */

        int n0 = 1;
        int n1 = 1;
        int n2;
        int sum = 2;
        System.out.println("The Fibonacci sequence is :");
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 10; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
            sum += n1;
        }

        System.out.println("\nThe Fibonacci sequence sum is :" + sum);
    }

    private static void bubbleSort(int[] intArray) {

        int n = intArray.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(intArray[j-1] < intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */

    static void recBubbleSort(int my_arr[], int len_arr){
        if (len_arr == 1)
            return;
        for (int i=0; i<len_arr-1; i++)
            if (my_arr[i] > my_arr[i+1]){
                int temp = my_arr[i];
                my_arr[i] = my_arr[i+1];
                my_arr[i+1] = temp;
            }
        recBubbleSort(my_arr, len_arr-1);
    }
}













