package com.dmilut.lesson_06.homework;

public class HomeworkYulia {

    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/12/20
            1.1. Объявить массив int
            1.2. Создать массив из п.1.1. с размером 10
            1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
         */
        System.out.println("Task 1.1");
        int [] array;
        array = new int[10];
        // Option 1 how to initialize
        int [] array2 = {9,8,7,6,5,4,3,2,1,0};
        // Option 2 how to initialize
        array = new int[]{0,1,2,3,4,5,6,7,8,9};


        /* TODO: 8/12/20
            2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
            2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
         */
        System.out.println('\n'+"Task 2.1, 2.2");
        String [] wordsArray = {"I", " ","love"," ", "arrays", " ", "very", " ", "much", "!"};
        for (int i=0; i<wordsArray.length; i++){
            System.out.print(wordsArray[i]);
        }

        /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
         */
        System.out.println('\n'+"Task 3.1");
        for (int i1=0; i1<array2.length; i1++) {
            System.out.println(array2[i1]);
        }

        System.out.println('\n'+"Task 3.2");
        for ( int i2 : array2) {
            System.out.println(i2);
        }

        System.out.println('\n'+"Task 3.3");
        int zero =0;
        while (zero< array.length){
            System.out.println(array2[zero]);
            zero++;
        }

        /* TODO: 8/12/20
            4.1. Используя циклы вывести все элементы массива
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
            в консоль
         */
        System.out.println('\n'+"Task 4.1");
        int [] [] doubleArray = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19} };
        for (int i = 0; i < doubleArray.length; i++) {

            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }

            System.out.println();
        }

        // Middle level
        /* TODO: 8/12/20
            5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
            5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
            Сделать это используя цикл.
         */
        System.out.println('\n' + "Task 5.1 & 5.2");
        String [] color = {"pink", "black", "red", "yellow", "while"};
        for (int i=0; i<color.length; i++) {
            System.out.println("The color of my mood is " + color[i]);
        }

        /* TODO: 8/12/20
            6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
         */
        System.out.println('\n' + "Task 6.1");
        int [] array3 = {5, 15, 20, 22, 29, -31, 100, 55, 20, 3, 10};
        int min = array3[0];
        for (int element : array3) {
            if (element < min)   {
                min = element;
            }
        }
         System.out.println("Minimum number is: " + min);

        /* TODO: 8/12/20
            7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
         */
        System.out.println('\n' + "Task 7.1");
        int [] array4 = {700, 644, 32, 890, 874, 23, -987, 1245, 8999, 546};
        int max = array4[0];
        for (int check : array4) {
            if (check > max) {
                max = check;
            }
        }
        System.out.println("The biggest number of this array is " + max);

        /* TODO: 8/12/20
            8.1. Найти и вывести в консоль только четные числа из произвольного массива int
         */
        System.out.println('\n' + "Task 8.1");
        int [] array5 = {2, 13, 5, 8, 10, 12, 17, 22, 33, 4, 1, 0};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i]%2==0) {
                System.out.println("Even numbers are: "+ array5[i]);
            }
        }

        /* TODO: 8/12/20
            9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
             возрастания
         */
        System.out.println('\n' + "Task 9.1");
        int [] array6 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for  (int d=9; d >=0; d--) {
            System.out.println(array6[d]);
        }
    }
}