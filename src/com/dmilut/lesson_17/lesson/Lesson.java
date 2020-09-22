package com.dmilut.lesson_17.lesson;

import java.util.Arrays;

public class Lesson {

    public static void main(String[] args) {
        int[] testArray = {3, 4, 1, 2};

        quickSort(testArray, 0, 3);
        System.out.println(Arrays.toString(testArray));

        System.out.println(sum(testArray));
    }

    // Quick sort сложность O(n*log n)
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) { // Если рассматриваются 2 и более элемента
            int partitionIndex = partition(array, startIndex, endIndex);

            quickSort(array, startIndex, partitionIndex - 1); // рекурсивный вызов quickSort для левого массива
            quickSort(array, partitionIndex + 1, endIndex); // рекурсивный вызов quickSort для правого массива
        }
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex]; //Опорный элемент
        int currentStartIndex = (startIndex - 1);

        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] <= pivot) {
                currentStartIndex++;

                swap(array, currentStartIndex, i);
            }
        }

        swap(array, currentStartIndex + 1, endIndex);

        return currentStartIndex + 1;
    }

    // Перестановка элементов
    private static void swap(int[] array, int index1, int index2) {
        int swapTemp = array[index1];
        array[index1] = array[index2];
        array[index2] = swapTemp;
    }


    public static int sum(int[] array) {

        if (array.length == 2) {
            return array[0] + array[1];
        }

        int[] array1 = arrayHalfCopy(array, 0);
        int[] array2 = arrayHalfCopy(array, (array.length / 2));

        return sum(array1) + sum(array2);
    }

    private static int[] arrayHalfCopy(int[] source, int index) {
        int[] result = new int[source.length / 2];

        if (index == 0) {
            for (int i = 0; i < source.length / 2; i++) {
                result[i] = source[i];
            }
        } else {
            for (int j = index; j < source.length; j++) {
                result[j - source.length / 2] = source[j];
            }
        }

        return result;
    }
}
