package com.dmilut.lesson_13.homework.homeworkVahe;

public class HomeworkVahe {

    public static void main(String[] args) {

    // 1.2. Продемонстрировать работу метода линейного поиска
        System.out.println("This is for linear method:");

        int elementToSearch = 99;
        int index = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, elementToSearch);
        print(elementToSearch, index);
        System.out.println();

    // 2.2. Продемонстрировать работу метода бинарного поиска

        System.out.println("This is for binary method:");

        int elementToSearch1 = 95;
        int index1 = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, elementToSearch1);
        print(elementToSearch1, index1);

    }

    // Easy level
    /* TODO: 9/7/20
        1.1. Написать метод реализующий алгоритм линейного поиска без использования циклов
     */

    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }

    // Middle level
    /* TODO: 9/7/20
        2.1. Написать метод реализующий алгоритм бинарного поиска с использованием рекурсии */

    public static int binarySearch(int arr[], int elementToSearch1) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == elementToSearch1) {
                return middleIndex;
            }

            else if (arr[middleIndex] < elementToSearch1)
                firstIndex = middleIndex + 1;


            else if (arr[middleIndex] > elementToSearch1)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }


}




