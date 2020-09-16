package com.dmilut.lesson_13.homework.homeworkVika;

public class HomeworkVika {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 1, 6};
        int search = 6;

        //Linear search

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                System.out.println(arr[i]);
            }
        }


       // 2.2. Продемонстрировать работу  бинарного метода
        System.out.println (binarySearch(new int[] {-1,2,5,15,34,67,99,101}, 99));
    }



         /* TODO: 9/7/20
        2.1. Написать метод реализующий алгоритм бинарного поиска с использованием рекурсии
      */

         public static int binarySearch(int[] a, int key) {

             int low = 0;
             int high = a.length - 1;

             while(low <= high) {
                 int middle = low + (high - low)/2;  // считаются индексы массива {1,2,3,4,5} -(high[4] - low[0])/2. Mid [2] єто 3

                 if(key < a[middle]) {
                     high = middle -1;

                 } else if(key > a[middle]) {
                     low = middle + 1;

                 } else {
                     return middle;
                 }
             }
             return -1;

         }



}












