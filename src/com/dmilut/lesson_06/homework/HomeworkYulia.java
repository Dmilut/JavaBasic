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
        System.out.println("Task 2.1, 2.2");
        String [] wordsArray = {"I", " ","love"," ", "arrays", " ", "very", " ", "much", "!"};
        for (int i=0; i<wordsArray.length; i++){
            System.out.print(wordsArray[i]);
        }

        /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
         */
        System.out.println("Task 3.1");
        for (int i1=0; i1<array2.length; i1++) {
            System.out.println(array2[i1]);
        }

        System.out.println("Task 3.2");
        for ( int i2 : array2) {
            System.out.println(i2);
        }

        System.out.println("Task 3.3");
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
        System.out.println("Task 4.1");
        int [] [] doubleArray = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19} };
       

    }
}