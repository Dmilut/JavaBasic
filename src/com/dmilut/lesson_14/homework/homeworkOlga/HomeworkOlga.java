package com.dmilut.lesson_14.homework.homeworkOlga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HomeworkOlga {

    public static void main(String[] args) {

        int[] testArray = {1, 9, 3, 7, 0, 15, 2, 28, 6, 5};
        selectionSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));

        /* TODO: 9/10/20
            2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */
        String test1 = "first";
        String test2 = "second";
        String test3 = "third";

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, test1);
        arrayList.add(test2);
        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(1));
        arrayList.set(1, test3);
        arrayList.remove(1);
        System.out.println(arrayList.toString());


        /* TODO: 9/10/20
            3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add(0, test1);
        linkedList.add(test2);
        System.out.println(linkedList.get(1));
        linkedList.set(1, test3);
        arrayList.remove(test2);
        System.out.println(linkedList.toString());
    }

    /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */
    public static void selectionSort(int[] testArray, int i, int n) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
            if (testArray[j] < testArray[min]) {
                min = j;
            }
        }
        swap(testArray, min, i);
        if (i + 1 < n) {
            selectionSort(testArray, i + 1, n);
        }
    }

    public static void swap(int[] testArray, int i, int j) {
        int temp = testArray[i];
        testArray[i] = testArray[j];
        testArray[j] = temp;
    }
}











