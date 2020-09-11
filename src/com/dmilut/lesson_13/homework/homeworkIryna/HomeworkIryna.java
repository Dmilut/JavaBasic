package com.dmilut.lesson_13.homework.homeworkIryna;

public class HomeworkIryna {


    public static void main(String[] args) {
        int[] testArray = {13,46,98,56,98,68,23,74,59,10};

        System.out.println(linearSearch(testArray, 0, 23));
        System.out.println(binarySearch(testArray, 0, testArray.length - 1, 46));

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
    public static int binarySearch(int[] array, int firstIndex, int lastIndex, int elementToSearch) {

        // Вычисляем индекс среднего элемента
        int midIndex = firstIndex + (lastIndex - firstIndex) / 2;

        // Вывод отладочной информации
        System.out.println("firstIndex=\t\t" + firstIndex);
        System.out.println("lastIndex=\t" + lastIndex);
        System.out.println("midIndex=\t\t" + midIndex);
        System.out.println("============================");

        // Проверяем средний элемент на соответствие искомому
        if (array[midIndex] == elementToSearch) {
            return midIndex;
        }

        // Проверяем, что последний элемент из проверяемых не == искомому
        if (firstIndex == lastIndex) {
            return -1;
        }

        // В случае, если искомый элемент в левой половине, делаем активным левый массив
        if (elementToSearch < array[midIndex]) {
            lastIndex = midIndex - 1;
        }

        // В случае, если искомый элемент в правой половине, делаем активным правый массив
        if (elementToSearch > array[midIndex]) {
            firstIndex = midIndex + 1;
        }

        // Рекурсивно вызываем этот же метод с новыми значениями аргументов
        return binarySearch(array, firstIndex, lastIndex, elementToSearch);
    }

    }

