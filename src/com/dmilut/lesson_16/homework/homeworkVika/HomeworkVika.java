package com.dmilut.lesson_16.homework.homeworkVika;

import java.util.Arrays;

public class HomeworkVika {

    public static void main(String[] args) {


         /* TODO: 9/16/20
        1.1. Реализовать сортировку пузырьком по убыванию */

         int[] array = {9,4,7,2,8,1,3,5,10,6};

         boolean isSorted = false;
         int buf;

         while(!isSorted) {
             isSorted = true;

             for(int i = 0; i < array.length - 1; i++) {

                 if(array[i] < array[i + 1]) {
                     isSorted = false;

                     buf = array[i];
                     array[i] = array[i + 1];
                     array[i + 1] = buf;
                 }
             }
         }

        System.out.println(Arrays.toString(array));

        System.out.println();

        /* TODO: 9/16/20
        3.1. Реализовать нахождение суммы чисел Фибоначчи заданного диапозона. Мой диапазон от 5 до 10 */

        int n0 = 5;
        int n1 = 6;
        int n2 ;

//        while (n2 <= 20) {
//            System.out.print(n2 + " ");
//            n2 = n0 + n1;
//            n0 = n1;
//            n1 = n2;
//        }
         System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 5; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();


    }

     /* TODO: 9/16/20
        2.1. Реализовать сортировку пузырьком с помощью рекурсии */

    public static void bubbleSortUsingRecursion(int[] array, int n) {

        if( n == 1) {
            return;
        }
        for(int i = 0; i < n-1; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        bubbleSortUsingRecursion(array, n-1);

    }






}








