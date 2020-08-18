package com.dmilut.lesson_06.homework;

import java.util.ArrayList;

public class HomeworkIrina {
    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/12/20
            1.1. Объявить массив int
            1.2. Создать массив из п.1.1. с размером 10
            1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
         */
        System.out.println("Task 1");

        int[] line;
        line = new int[10];
        //#1
        line[9] = 1684532976;
        //#2
        line[0] = 1;
        line[1] = 6;
        line[2] = 8;
        line[3] = 4;
        line[4] = 5;
        line[5] = 3;
        line[6] = 2;
        line[7] = 9;
        line[8] = 7;
        line[9] = 6;


        /* TODO: 8/12/20
            2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
            2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
         */
        System.out.println("Task 2");

        char[] a;
        a = new char[2];
        a[0] = '"';
        a[1] = '!';
        String[] b;
        b = new String[5];
        b[0] = "люблю ";
        b[1] = "массивы ";
        b[2] = "очень ";
        b[3] = "сильно";
        b[4] = "Я ";
        System.out.println(a[0] + b[4] + b[0] + b[1] + b[2] + b[3] + a[1] + a[0]);

        System.out.println('\n');


        /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
        */

        System.out.println("Task 3");

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i <= 9; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println('\n');
        int h = 0;
        while (h < array.length) {
            System.out.print(array[h] + " ");
            h++;
        }
        System.out.println('\n');



        /* TODO: 8/12/20
            4.1. Используя циклы вывести все элементы массива
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
            в консоль
         */
        System.out.println("Task 4 - way 1");
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        for (int q = 0; q <= 9; q++) {
            System.out.print(arr1[q] + " ");
        }
        System.out.println('\n');

        for (int w = 0; w <= 9; w++) {
            System.out.print(arr2[w] + " ");
        }
        System.out.println('\n');
        System.out.println("Task 4 - way 2");
        for (int k : arr1) {
            System.out.print(k + " ");
        }
        System.out.println('\n');
        int w = 0;
        do {
            System.out.print(arr2[w] + " ");
            w++;
        }

        while (w <= 9);

        // Middle level
        /* TODO: 8/12/20
            5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
            5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
            Сделать это используя цикл.
         */
        System.out.println('\n');
        System.out.println("Task 5");

        String[] colors = {"blue", "red", "white", "green", "purple"};
        String song = "Color of the mood is ";
        for (int x = 0; x < 5; x++) {
            System.out.println(song + colors[x]);
        }
        // or

        System.out.println("OR");
        int f = 0;
        while (f <= 4) {
            System.out.println(song + colors[f]);
            f++;
        }
        System.out.println("OR");
        for (String n : colors) {
            System.out.println(song + n);
        }


        /* TODO: 8/12/20
            6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
         */
        System.out.println('\n');
        System.out.println("Task 6");

        int[] random = {4, 5, 9, 48, 99, 17, 24, 47, 200, 1000};
        int min = random[0];
        for (int s : random) {
            if (s < min) {
                min = s;
                System.out.println("min number is " + min);
            }
        }
        System.out.println("min number is " + min);


        /* TODO: 8/12/20
            7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
         */
        System.out.println('\n');
        System.out.println("Task 7");

        int max = random[0];
        for (int z : random) {
            if (z > max) {
                max = z;
            }
        }
        System.out.println("max number is " + max);

        /* TODO: 8/12/20
            8.1. Найти и вывести в консоль только четные числа из произвольного массива int
         */
        System.out.println('\n');
        System.out.println("Task 8");
        System.out.println("Even numbers are: ");
        for (int p = 0; p < random.length; p++) {
            if (random[p] % 2 == 0) {
                System.out.print(random[p] + " ");
            }
        }


        /* TODO: 8/12/20
            9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
             возрастания
         */
        System.out.println('\n');
        System.out.println("Task 9");
        int[] asc = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int u;
        for (u = 9; u >= 0; u--) {
            System.out.print(asc[u] + " ");
        }

        //Hard level
        /* TODO: 8/12/20
            10.1. Нарисовать в консоли поле для игры в "крестики-нолики" из 9 клеток используя данные из многомерного
             массива
            10.2. Записать в поле произвольно поставленный "крестик"
            10.3. Записать в поле произвольно поставленный "нолик", проверив, что он ставится на свободное место
            10.4. Вывести поле с "крестиками" и "ноликами" в консоль
         */
        System.out.println('\n');
        System.out.println("Task 10");
        for (int v1 = 0; v1 < 7; v1++) {
            for (int h1 = 0; h1 < 4; h1++) {
                if (v1 == 0 || v1 == 2 || v1 == 4 || v1 == 6) {
                    System.out.print("_ ");
                } else if (v1 == 1 || v1 == 3 || v1 == 5) {
                    System.out.print("| ");
                }

            }
            System.out.print("\n");

        }

        //int[]h1=new int[4];
        //h1


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

    }
}

