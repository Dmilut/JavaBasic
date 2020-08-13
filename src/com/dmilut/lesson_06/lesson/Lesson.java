package com.dmilut.lesson_06.lesson;

public class Lesson {

    public static void main(String[] args) {

        //  Синтаксис --------------------------------------------------------------------
        /*  Синтаксис для объявления переменной массива:
            dataType[] array;   // Предпочтительный способ.
            или
            dataType array[];  //  Работает, но не является предпочтительным способом. */

        int[] array;
        int array1[];

        /*  Синтаксис для создания массива:
            с помощью оператора new:
                arrayRefVar = new dataType[arraySize]; */

        int[] array2 = {1, 2, 3};

        /*  Синтаксис для создания и инициализация массива:
                dataType[] arrayRefVar = {значение0, значение1, ..., значениеk}; */

        int[] array3 = {1, 2, 3};

        //  Работа с массивами -----------------------------------------------------------
        /*  Вывести на экран все элементы массива */
        System.out.println('\n' + "Вывести на экран все элементы массива");

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Пример решения задачи "Поиск минимального элемента в массиве"
        System.out.println('\n' + "Поиск минимального элемента в массиве");

        int min = 0;
        int[] myArray1 = {0, -1, 238, -5, -111, 2, 4, 5, 7};
        for (int element : myArray1) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);

        // Вывод в консоль многомерного массива
        System.out.println('\n' + "Вывод в консоль многомерного массива");

        int[][] twoArray = {
                {5, 7, 3, 17},
                {7, 0, 1, 12},
                {8, 1, 2, 3}};

        System.out.println("Вариант с циклом for:");
        System.out.println("twoArray.length = " + twoArray.length);
        System.out.println("twoArray[0].length = " + twoArray[0].length);

        for (int i = 0; i < twoArray.length; i++) {

            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println('\n' + "Вариант с циклом foreach:");
        System.out.println("test");

        for (int[] element : twoArray) {
            for (int element1 : element) {
                System.out.print(element1 + " ");
            }

            System.out.println();
        }
    }
}
