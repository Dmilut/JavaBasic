package com.dmilut.lesson_14.homework.reference;

public class HomeworkReference {

    public static void main(String[] args) {

        // Recursive selection sort test
        int[] testArray = {4, 3, 0, 1, 2};

        selectionSort(testArray, 0);
        printArray(testArray);


        // Custom Array list test
        CustomArrayList testArrayList1 = new CustomArrayList();
        String testElement1 = "testElement1";
        String testElement2 = "testElement2";
        String testElement3 = "testElement3";
        String testElement4 = "testElement4";
        String testElement5 = "testElement5";

        testArrayList1.add(testElement1);
        testArrayList1.set(1, testElement2);
        printCustomArrayList(testArrayList1);

        testArrayList1.removeByElement(testElement2);
        testArrayList1.removeByIndex(0);
        printCustomArrayList(testArrayList1);

        testArrayList1.add(testElement1);
        testArrayList1.add(testElement2);
        testArrayList1.add(testElement3);
        testArrayList1.add(testElement4);
        testArrayList1.add(testElement5);
        testArrayList1.add(testElement1);
        printCustomArrayList(testArrayList1);
    }

    /* TODO: 9/10/20
        1.1. Реализовать сортировку выбором с помощью рекурсии */

    // Recursive Selection Sort
    public static void selectionSort(int[] array, int startIndex) {

        // Условие выхода если index указывает на последний элемент в массиве
        if (startIndex == array.length - 1) {
            return;
        }

        // Текущий индекс минимального элемента
        int minIndex = startIndex;

        // Проходим по всем элементам и ищем наименьший по сравнению со startIndex
        for (int index = startIndex + 1; index < array.length; index++) {
            if (array[index] < array[minIndex]) {
                minIndex = index;
            }
        }

        // Swap - меняем элементы местами
        int temp = array[startIndex];
        array[startIndex] = array[minIndex];
        array[minIndex] = temp;

        // Рекурсивный вызов selectionSort с новым индексом
        selectionSort(array, startIndex + 1);
    }

    // Вспомогательный метод для вывода содержимого CustomArrayList в консоль
    private static void printCustomArrayList(CustomArrayList arrayList) {
        System.out.println("=================================");
        for (int i = 0; i < arrayList.length(); i++) {
            System.out.println("index= " + i + " ; element= " + arrayList.get(i));
        }

    }

    // Вспомогательный метод для вывода содержимого массива в консоль
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }

}
