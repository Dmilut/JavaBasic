package com.dmilut.lesson_06.homework;

public class HomeworkOlha {
    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/12/20
            1.1. Объявить массив int
            1.2. Создать массив из п.1.1. с размером 10
            1.3. Инициализировать массив из п.1.1. с набором данных: 0,1,2,3,4,5,6,7,8,9 двумя различными путями
         */

        System.out.println("Problem 1");
        /*1.1, 1.2, 1.3.1 */
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        System.out.println(array [3]);

        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; /* 1.3.2 */
        System.out.println(array1 [1]);


        /* TODO: 8/12/20
            2.1. Строку "Я люблю массивы очень сильно!" сохранить в массиве разбив по словам и символам
            2.2. Вывести в консоль все элменты массива из п.2.1. так, чтобы получилась первоначальная строка
         */
        System.out.println("Problem 2");
        /*2.1*/
        String [] arrayWord = {"Я"," ", "люблю", " ", "массивы", " ", "очень", " ", "сильно", "!"};
        /*2.2*/
        for (int i = 0; i < arrayWord.length; i++) {
            System.out.print(arrayWord[i]);
        }


        /* TODO: 8/12/20
            3.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль
            3.2. Сделать п.3.1. с циклом foreach
            3.3. Сделать п.3.1. с циклом while
         */
        System.out.println("Problem 3");

        /*3.1*/
        int [] arrayNum = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }

        /*3.2*/
        int [] aNum = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int num : aNum) {
            System.out.print(num);
        }

        /*3.3*/
        int [] aNum1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int a = 0;
        while (a <= 2)
        {
            System.out.println(aNum1[a]);
            a++;
        }



        /* TODO: 8/12/20
            4.1. Используя циклы вывести все элементы массива
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
            в консоль
         */
        System.out.println("Problem 4");

        int[][] arr = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}};
        for (int o = 0; o < arr.length; o++) {
            for (int k = 0; k < arr[o].length; k++) {
                System.out.print(arr[o][k] + " ");
            }
            System.out.println();
        }


        // Middle level
        /* TODO: 8/12/20
            5.1. Создать массив с названиями 5 цветов на ваше усмотрение (н.п.: розовый, черный, красный, желтый, белый)
            5.2. Вывести в консоль строчку из песни "Цвет настроения синий!" меняя цвет на цвета из массива.
            Сделать это используя цикл.
         */
        System.out.println("Problem 5");

                 String [] arrayColor = {"синий!", "зелёный!", "красный!", "фиолетовый!", "чёрный!", "жёлтый!", "белый!"};
                 System.out.print("Цвет настроения - " + arrayColor[1]);

          System.out.println("Problem 5a");

                   String [] arrayColor = {"синий!", "зелёный!", "красный!", "фиолетовый!", "чёрный!", "жёлтый!", "белый!"};
                    for (String element : arrayColor){
                   System.out.print("Цвет настроения - " + element + "");
                    }

          System.out.println("Problem 5b");

                   String [] arrayColor = {"синий!", "зелёный!", "красный!", "фиолетовый!", "чёрный!", "жёлтый!", "белый!"};
                   for (int i = 0; i < arrayColor.length; i++) {
                   System.out.println("Цвет настроения - " + arrayColor[i] + " ");
                   }

                 /* TODO: 8/12/20
              6.1. Найти и вывести в консоль наименьшее число из произвольного массива int
         */
          System.out.println("Problem 6a");

                   int n = 0;
                   int [] myArrayNum = {9, 78, 35, 69, 5, 104, 31, -2, 11, 300};
                    for (int element:myArrayNum){
                        if (element < n){
                            n = element;
                        }
                    }
                    System.out.println (n);
                    
        /* TODO: 8/12/20
            7.1. Найти и вывести в консоль наибольшее число из произвольного массива int
         */

          System.out.println("Problem 7");
          
              int n1 = 0;
             int [] myArrayNum = {9, 78, 35, 69, 5, 104, 31, -2, 11, 350};
              for (int element:myArrayNum){
                  if (element > n1){
                      n1 = element;
                  }
              }
              System.out.println (n1);

        /* TODO: 8/12/20
            8.1. Найти и вывести в консоль только четные числа из произвольного массива int
         */
        System.out.println("Problem 8");

         	int [] myArrayNum = {9, 78, 35, 69, 5, 104, 31, -2, 11, 350};
         	 for (int i2 = 0 ; i2 < myArrayNum.length ; i2++)
         	 {
             if(myArrayNum[i2] % 2 == 0)
             {
                 System.out.println(myArrayNum[i2] + "");
                 }
               }

        /* TODO: 8/12/20
            9.1. Используя цикл for вывести все элементы массива [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в консоль в порядке
             возрастания
         */
           System.out.println("Problem 9");

        int [] myArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if(myArray[i] > myArray[j]) {
                    int d = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = d;
                }
            }
            System.out.println(myArray[i]);
        }





        //Hard level
        /* TODO: 8/12/20
            10.1. Нарисовать в консоли поле для игры в "крестики-нолики" из 9 клеток используя данные из многомерного
             массива
            10.2. Записать в поле произвольно поставленный "крестик"
            10.3. Записать в поле произвольно поставленный "нолик", проверив, что он ставится на свободное место
            10.4. Вывести поле с "крестиками" и "ноликами" в консоль
         */

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
