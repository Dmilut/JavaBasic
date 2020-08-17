package com.dmilut.lesson_06.homework;

import java.util.Random;

public class HomeworkOlga {
    public static void main(String[] args) {
        // Easy level
                /* TODO: 8/12/20
                    1.1. Объявить массив int
                    1.2. Создать массив из п.1.1. с размером 10
                    1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
                 */

        System.out.println('\n' + "Задача 1.1.-1.3.");
        int[] array;
        array = new int[10];
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

                /* TODO: 8/12/20
                    2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
                    2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
                 */

        System.out.println('\n' + "Задача 2.1.-2.2.");
        String[] array2;
        array2 = new String[6];
        array2[0] = "Я ";
        array2[1] = "люблю ";
        array2[2] = "массивы ";
        array2[3] = "очень ";
        array2[4] = "сильно";
        array2[5] = "!";
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }

                /* TODO: 8/12/20
                    3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
                    3.2. Сделать п.3.1. с циклом foreach
                    3.3. Сделать п.3.1. с циклом while
                 */

        System.out.println('\n' + "Задача 3.1.-3.3.");
        int[] array3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println(" ");

        for (int element : array3) {
            System.out.print(element + " ");
        }

        System.out.println(" ");

        int b = 0;
        while (b < array3.length) {
            System.out.print(array3[b] + " ");
            b++;
        }

                /* TODO: 8/12/20
                    4.1. Используя циклы вывести все элементы массива
                    {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                    {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
                    в консоль
                 */

        System.out.println('\n' + "Задача 4.1");
        int[][] array4 = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}};
        for (int i = 0; i < array4.length; i++) {

            for (int x = 0; x < array4[i].length; x++) {
                System.out.print(array4[i][x] + " ");
            }

            System.out.println();
        }

        // Middle level
                /* TODO: 8/12/20
                    5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
                    5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
                    Сделать это используя цикл.
                 */

        System.out.println('\n' + "Задача 5.1.-5.2.");
        String[] array5 = {"розовый", "черный", "красный", "желтый", "белый"};
        for (int i = 0; i < array5.length; i++) {
            System.out.println("Цвет настроения " + array5[i] + "!");
        }

                /* TODO: 8/12/20
                    6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
                 */

        System.out.println('\n' + "Задача 6.1");
        int array6[] = new int[]{15, 11, 8, 22, 12, 2};
        int minArray6 = array6[0];
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] < minArray6) {
                minArray6 = array6[i];
            }
        }
        System.out.println(minArray6);

                /* TODO: 8/12/20
                    7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
                 */

        System.out.println('\n' + "Задача 7.1");
        int array7[] = new int[]{15, 11, 8, 22, 12, 1};
        int maxArray7 = 0;
        for (int element : array7) {
            if (element > maxArray7) {
                maxArray7 = element;
            }
        }
        System.out.println(maxArray7);

                /* TODO: 8/12/20
                    8.1. Найти и вывести в консоль только четные числа из произвольного массива int
                 */

        System.out.println('\n' + "Задача 8.1");
        int array8[] = new int[]{15, 11, 8, 22, 12, 1};
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] % 2 == 0) {
                System.out.println(array8[i]);
            }

        }
                /* TODO: 8/12/20
                    9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
                     возрастания
                 */

        System.out.println('\n' + "Задача 9.1");
        int array9[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int x = 9; x >= 0; x--) {
            System.out.print(array9[x] + " ");
        }

                //Hard level
                /* TODO: 8/12/20
                    10.1. Нарисовать в консоли поле для игры в "крестики-нолики" из 9 клеток используя данные из многомерного
                     массива
                    10.2. Записать в поле произвольно поставленный "крестик"
                    10.3. Записать в поле произвольно поставленный "нолик", проверив, что он ставится на свободное место
                    10.4. Вывести поле с "крестиками" и "ноликами" в консоль
                 */

        System.out.println('\n' + "Задача 10.1-10.4");

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
    }

}







