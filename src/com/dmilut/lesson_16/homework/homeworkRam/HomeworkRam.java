package com.dmilut.lesson_16.homework.homeworkRam;

import java.util.Arrays;

public class HomeworkRam {


    public static void main(String[] args) {
        int[] array = {98, 32, 8, 43, 14, 16, 7, 47, 2, 84};


        //        По возрастанию

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

//// По убыванию

        boolean isSorted1 = false;
        int temp1;
        while (!isSorted1) {
            isSorted1 = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted1 = false;

                    temp1 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(array));

//
//// Число фибоначи

        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 30; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }


//        Второй метод


        int size = 15;
        int n01 = 1;
        int n02 = 1;
        int n03;
        int[] array2 = new int[size];

        array2[0] = n01;
        array2[1] = n02;

        for (int i = 2; i < size; i++) {

            n03 = n01 + n02;
            n01 = n02;
            n02 = n03;

            array2[i] = n03;
            System.out.print(array2[i] + " ");
        }


    }


}













