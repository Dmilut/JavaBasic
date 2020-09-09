package com.dmilut.lesson_13.homework.reference;

public class HomeworkRefernce {


    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(testArray, 0, 11));

    }


    // Easy level
    /* TODO: 9/7/20
        1.1. Написать метод реализующий алгоритм линейного поиска без использования циклов
        1.2. Продемонстрировать работу метода
     */

    // Recursive linear search without cycles
    public static int linearSearch(int[] array, int startIndex, int elementToSearch) {
        if (array[startIndex] == elementToSearch) {
            return startIndex;
        }

        if (startIndex == array.length - 1)
            return -1;

        return linearSearch(array, startIndex + 1, elementToSearch);
    }


}
