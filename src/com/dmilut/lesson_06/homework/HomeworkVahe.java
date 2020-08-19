package com.dmilut.lesson_06.homework;

import java.util.Random;

public class HomeworkVahe {
    public static void main(String[] args) {
        // Easy level
        /* TODO: 8/12/20
            1.1. Объявить массив int
            1.2. Создать массив из п.1.1. с размером 10
            1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
        */
        System.out.println('\n' + "Задача 1");
        //Method 1
        int[] array;
        array = new int[10];
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Method 2
        int[] array1;
        array1 = new int[10];
        for (int b = 0; b < array1.length; b++) {
            array1[b] = b;
        }
        System.out.println();

        /* TODO: 8/12/20
            2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
            2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
         */
        System.out.println('\n' + "Задача 2");
        String[] array2 = {"Я", " ", "люблю", " ", "массивы", " ", "очень", " ", "сильно", "!"};
        for (int c = 0; c < array2.length; c++) {
            System.out.print(array2[c]);
        }
        System.out.println();


        /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
         */
        System.out.println('\n' + "Задача 3");
        System.out.println('\n' + "With for");
        int[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int d = 0; d < array3.length; d++) {
            System.out.print(array3[d] + " ");
        }
        System.out.println();

        System.out.println('\n' + "With for each");
        int[] array4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int e : array4) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println('\n' + "With while");
        int[] array5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int f = 0;
        while (f < array5.length) {
            System.out.print(array5[f] + " ");
            f++;
        }
        System.out.println();

        /* TODO: 8/12/20
            4.1. Используя циклы вывести все элементы массива
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
            в консоль
         */
        System.out.println('\n' + "Задача 4");
        int[][] twoArray = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}};
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Middle level
        /* TODO: 8/12/20
            5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
            5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
            Сделать это используя цикл.
         */
        System.out.println('\n' + "Задача 5");
        String[] array6 = {"розовый", "черный", "красный", "желтый", "белый"};
        for (int g = 0; g < array6.length; g++) {
            System.out.println("Цвет настроения" + " " + array6[g]);
        }
        System.out.println();

        /* TODO: 8/12/20
            6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
         */
        System.out.println('\n' + "Задача 6");
        int min = 0;
        int[] array7 = {12, -24, 33, 66, -125, 10, 20, 30};
        for (int element : array7) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Наименьшее число = " + min);
        System.out.println();

        /* TODO: 8/12/20
            7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
         */
        System.out.println('\n' + "Задача 7");
        int max = 0;
        int[] array8 = {12, -24, 33, 66, -125, 10, 20, 30};
        for (int element : array8) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Набольшее число = " + max);
        System.out.println();

        /* TODO: 8/12/20
            8.1. Найти и вывести в консоль только четные числа из произвольного массива int
         */
        System.out.println('\n' + "Задача 8");
        int[] array9 = {12, -24, 33, 66, -125, 10, 20, 30};
        for (int h : array9) {
            if (h % 2 == 0) {
                System.out.print(h + " ");
            }
        }
        System.out.println();

        /* TODO: 8/12/20
            9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
             возрастания
         */
        System.out.println('\n' + "Задача 9");
        int[] array10 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int k = array10.length - 1; k >= 0; k--) {
            System.out.print(array10[k] + " ");
        }
        System.out.println();

        //Hard level
        /* TODO: 8/12/20
            10.1. Нарисовать в консоли поле для игры в "крестики-нолики" из 9 клеток используя данные из многомерного
             массива
            10.2. Записать в поле произвольно поставленный "крестик"
            10.3. Записать в поле произвольно поставленный "нолик", проверив, что он ставится на свободное место
            10.4. Вывести поле с "крестиками" и "ноликами" в консоль
         */
        System.out.println('\n' + "Задача 10");

        String cell = "|___|";
        String tic = "|_x_|";
        String tac = "|_o_|";
        String[][] array11 = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array11[i][j] = cell;
            }
        }

        System.out.println('\n' + "Print blank Tic-tac-toe board");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array11[i][j]);
            }
            System.out.println("\n");
        }

        Random r = new Random();
        int rand1 = r.nextInt(3);

        if (array11[rand1][rand1] == cell) {
            array11[rand1][rand1] = tic;
        }

        int rand2 = r.nextInt(3);
        if (array11[rand2][rand2] == cell) {
            array11[rand2][rand2] = tac;
        }

        System.out.println('\n' + "Print filled in Tic-tac-toe board");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array11[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println();

        /* TODO: 8/12/20
            11.1. Создать многомерный массив, который бы хранил информацию о игровом поле игры "морской бой" с размером
            поля 10x10
            11.2. Заполнить поле кораблями из расчета:
                5 1-клеточных
                4 2-клеточных
                3 3-клеточных
                2 4-клеточных
                1 5-клеточный
            11.3. Вывести поле с кораблями в консоль
         */
        System.out.println('\n' + "Задача 11");
        String cell1 = "|_|";
        String tic1 = "|x|";
        String[][] array12 = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array12[i][j] = cell1;
            }
        }

        System.out.println('\n' + "Print blank board");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array12[i][j]);
            }
            System.out.println();
        }

        for (int j = 0; j < 5; j++) {
            array12[0][j] = tic1;
        }
        for (int i = 2; i < 5; i += 2) {
            for (int j = 0; j < 4; j++) {
                array12[i][j] = tic1;
            }
        }
        for (int i = 2; i < 7; i += 2) {
            for (int j = 5; j < 8; j++) {
                array12[i][j] = tic1;
            }
        }

        for (int j = 0; j < 2; j++) {
            array12[6][j] = tic1;
        }

        for (int j = 0; j < 8; j++) {
            if (j != 2 && j != 5) {
                array12[8][j] = tic1;
            }
        }
        for (int i = 0; i < 9; i += 2) {
            array12[i][9] = tic1;
        }

        System.out.println('\n' + "Print filled board");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array12[i][j]);
            }
            System.out.println();
        }
    }
}
