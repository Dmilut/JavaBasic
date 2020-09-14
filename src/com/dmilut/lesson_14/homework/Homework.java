package com.dmilut.lesson_14.homework;

import com.dmilut.lesson_14.homework.homeworkVika.CustomArrayList;

import java.util.Arrays;

public class Homework {

    /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */

    /* TODO: 9/10/20
        2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */

    /* TODO: 9/10/20
        3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */

    public static void main(String[] args) {

        int[] unsortedArray = {34,89,56,1,9,22};

        System.out.println(Arrays.toString(unsortedArray));
        choiceSort(unsortedArray);


        //2.1

        String arrayTest1 = "test1";
        String arrayTest2 = "test2";
        String arrayTest3 = "test3";

        CustomArrayList testArrayList1 = new CustomArrayList();

        testArrayList1.add(1,arrayTest1);
        System.out.println(testArrayList1.get(1));

        testArrayList1.set(2,arrayTest2);
        testArrayList1.removeByIndex(5);
        System.out.println(testArrayList1.toString());



    }

    public static void choiceSort(int[] arrayToSort) {

        //Проходим по массиву
        //найти мин.элемент
        //меняем местами первый и мин.элемент

        //повторяем все пока не пройдем по всему массиву

        int indexMin;

        for(int index = 0; index < arrayToSort.length - 1; index++) {

            indexMin = index;

            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++ ) {

                if(arrayToSort[indexMin] > arrayToSort[indexToScan]) {

                    indexMin = indexToScan;

                }
            }

            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
        }

        System.out.println (Arrays.toString(arrayToSort)); // служебный класс с методом чтоб напечатать массив

    }




}
