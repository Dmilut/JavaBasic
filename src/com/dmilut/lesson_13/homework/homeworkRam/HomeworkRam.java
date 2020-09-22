package com.dmilut.lesson_13.homework.homeworkRam;

public class HomeworkRam {

    public static void main(String[] args) {

        int[] shortTestArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] longTestArray = longArrayBuilder(1_000_000);
    }

    // Iterative linear search - сложность O(n)
    public static int linearSearch(int[] array, int elementToSearch) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == elementToSearch)
                return index;
        }
        return -1;
    }


    // Iterative binary search - сложность O(lg(n))
    public static int binarySearch(int[] array, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    private static int[] longArrayBuilder(int arraySize) {
        int[] array = new int[arraySize];
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value++;
        }

        return array;
    }
}


