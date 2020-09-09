package com.dmilut.lesson_13.homework.reference;

public class HomeworkReference {


    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(testArray, 0, 6));
        System.out.println(binarySearch(testArray, 0, testArray.length - 1, 11));

    }

    // Easy level
    /* TODO: 9/7/20
        1.1. Написать метод реализующий алгоритм линейного поиска без использования циклов
        1.2. Продемонстрировать работу метода
     */
    // Recursive linear search without cycles, O(n)
    public static int linearSearch(int[] array, int index, int elementToSearch) {

        // Вывод отладочной информации
        System.out.println("index=\t" + index);

        // Проверяем, что проверяемый элемент соответствует искомому
        if (array[index] == elementToSearch) {
            return index;
        }

        // Проверяем, что проверили все элементы
        if (index == array.length - 1)
            return -1;

        // Рекурсивно вызываем этот же метод с новыми значениями аргументов
        return linearSearch(array, index + 1, elementToSearch);
    }


    // Middle level
    /* TODO: 9/7/20
        2.1. Написать метод реализующий алгоритм бинарного поиска с использованием рекурсии
        2.2. Продемонстрировать работу метода
     */
    // Recursive binary search without cycles, O(log(n))
    public static int binarySearch(int[] array, int startIndex, int finishIndex, int elementToSearch) {

        // Вычисляем индекс среднего элемента
        int midIndex = startIndex + (finishIndex - startIndex) / 2;

        // Вывод отладочной информации
        System.out.println("startIndex=\t\t" + startIndex);
        System.out.println("finishIndex=\t" + finishIndex);
        System.out.println("midIndex=\t\t" + midIndex);
        System.out.println("============================");

        // Проверяем средний элемент на соответствие искомому
        if (array[midIndex] == elementToSearch) {
            return midIndex;
        }

        // Проверяем, что последний элемент из проверяемых не == искомому
        if (startIndex == finishIndex) {
            return -1;
        }

        // В случае, если искомый элемент в левой половине, делаем активным левый массив
        if (elementToSearch < array[midIndex]) {
            finishIndex = midIndex - 1;
        }

        // В случае, если искомый элемент в правой половине, делаем активным правый массив
        if (elementToSearch > array[midIndex]) {
            startIndex = midIndex + 1;
        }

        // Рекурсивно вызываем этот же метод с новыми значениями аргументов
        return binarySearch(array, startIndex, finishIndex, elementToSearch);
    }

}
