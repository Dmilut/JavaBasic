package com.dmilut.lesson_17.homework.homeworkVahe;

import java.util.Arrays;

public class HomeworkVahe {

    public static void main(String[] args) {

    /* TODO: 9/21/20
        1.1. Провести отладку (дебагинг) метода quickSort из класса Lesson.
         Детально разобраться как он работает */

    /* TODO: 9/21/20
        2.1. Используя подход "разделяй и властвуй" написать метод для
        поиска произвольного числа в массиве */

        int[] myArray = {30, 10, 7, 50, 40 , 12, 64, 3, 15, 48, 36, 100};

        com.dmilut.lesson_17.lesson.Lesson.quickSort(myArray, 0, myArray.length - 1);
        System.out.println("\nThe array after quick sort is:");
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        int elementToSearch = 3;
        String elemIndexOrder;
        int elemIndex = recursiveBinarySearch(myArray, 0, myArray.length - 1, elementToSearch) + 1;

        switch (elemIndex%10) {
            case 1:
                elemIndexOrder = elemIndex + "st";
                break;
            case 2:
                elemIndexOrder = elemIndex + "nd";
                break;
            case 3:
                elemIndexOrder = elemIndex + "rd";
                break;
            default:
                elemIndexOrder = elemIndex + "th";
                break;
        }

        if (3 < elemIndex && elemIndex < 21) {
            elemIndexOrder = elemIndex + "th";
        }

        if (elemIndex != 0){
            System.out.println("Element to search " + elementToSearch + " is the " + elemIndexOrder + " element of array.");
        }
        else {
            System.out.println("Element to search " + elementToSearch + " is not found in the array.");
        }
    }


    public static int recursiveBinarySearch(int array[], int firstIndex, int lastIndex, int elementToSearch) {

        if (lastIndex >= firstIndex) {
            int mid = firstIndex + (lastIndex - firstIndex) / 2;

            if (array[mid] == elementToSearch)
                return mid;

            if (array[mid] > elementToSearch)
                return recursiveBinarySearch(array, firstIndex, mid - 1, elementToSearch);

            return recursiveBinarySearch(array, mid + 1, lastIndex, elementToSearch);
        }

        return -1;
    }
}













