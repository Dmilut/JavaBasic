package com.dmilut.lesson_13.lesson;

public class Lesson {

    public static void main(String[] args) {

        int[] shortTestArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] longTestArray = longArrayBuilder(1_000_000);

        long startTime = System.nanoTime();
        System.out.println(binarySearch(shortTestArray, 9));
        long finishTime = System.nanoTime();

        double time1 = (finishTime - startTime) / 1_000_000D;
        System.out.println("time = " + time1);

        startTime = System.nanoTime();
        System.out.println(binarySearch(longTestArray, 9));
        finishTime = System.nanoTime();

        double time2 = (finishTime - startTime) / 1_000_000D;
        System.out.println("time = " + time2);


    }

    // Iterative linear search, O(n)
    public static int linearSearch(int[] array, int elementToSearch) {

        // В цикле обходим все элементы массива и сравниваем с искомым
        for (int index = 0; index < array.length; index++) {
            if (array[index] == elementToSearch)
                // Возвращаем индекс найденного элемента
                return index;
        }
        // Если во время проверки ничего не нашли, то возвращаем -1
        return -1;
    }


    // Iterative binary search, O(lg(n))
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

    // Вспомогательный метод для генерации упорядоченного по возрастанию массива
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


