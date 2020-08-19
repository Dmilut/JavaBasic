package com.dmilut.lesson_06.homework;

public class HomeworkRam {

    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/12/20
            1.1. Объявить массив int
            1.2. Создать массив из п.1.1. с размером 10
            1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
         */

        System.out.println("Задание 1");


        int[] array;
        String[] array2;

        array = new int[10];
        array2 = new String[10];

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        array[9] = 9;

        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(array3[2]);


        System.out.println("Задание 2");

         /* TODO: 8/12/20
            2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
            2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
         */


        String[] array4 = {"Я", "люблю", "массивы", "очень", "сильно", "!"};
        for (int i = 0; i < array4.length; i++) {

            System.out.print(array4[i] + " ");
        }


        System.out.println("Задание 3");

          /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
           */

        int[] array5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int z = 0;
        for (int a = 0; a < array5.length; a++) {
            System.out.println(array5[a]);
        }


        for (int b : array5) {
            System.out.println(array5[b]);
        }
        while (z < array5.length) {
            System.out.println(array5[z]);
            z++;
        }

        System.out.println("Задание 4");

        /* TODO: 8/12/20
            4.1. Используя циклы вывести все элементы массива
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
            в консоль
         */


        int[] array6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int x = 0; x < array6.length; x++) {
            System.out.println(array6[x]);
        }


        int[] array7 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int q = 0;

        while (q < array7.length) {
            System.out.println(array7[q]);
            q++;


        }


        System.out.println("Задание 5");



        // Middle level
        /* TODO: 8/12/20
            5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
            5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
            Сделать это используя цикл.
         */

        {
            String[] array8 = {"розовый", "черный", "красный", "желтый", "белый"};
            int w = 0;
            while (w < array8.length) {
                System.out.println("Цвет настроения" + " " + array8[w]);
                w++;
            }


            System.out.println("Задание 6");

         /* TODO: 8/12/20
            6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
         */


            int[] array10 = {15, 36, 98, 52, 14, 75, 42, 23, 10};
            int n = 100;

            for (int b : array10) {
                if (b < n) {
                    n = b;
                }
            }
            System.out.println(n);


            System.out.println("Задание 7");


        /* TODO: 8/12/20
            7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
         */


            int[] array9 = {15, 36, 98, 52, 14, 75, 42, 23, 10};
            int m = 0;
            for (int b : array9) {
                if (b > m) {
                    m = b;
                }
            }
            System.out.println(m);


            System.out.println("Задание 8");


        /* TODO: 8/12/20
            8.1. Найти и вывести в консоль только четные числа из произвольного массива int
         */

            int[] array11 = {15, 36, 98, 52, 14, 75, 42, 23, 10};


            for (int b : array11) {
                if (b % 2 == 0) {
                    System.out.println(b);
                }
            }


            System.out.println("Задание 9");


          /* TODO: 8/12/20
            9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
             возрастания
         */
/*
        int[] array11 = {15, 36, 98, 52, 14, 75, 42, 23, 10};
        int m = 0;*/
//         for (int l = 0; l < array11.length; l++){
//
//                  System.out.println(array11[l]);


     /*   for (int b : array11) {
            if (b > m) {
                m = b;
            } else if () {
                System.out.println(array11[b]);
*/

        }
    }
}






