package com.dmilut.lesson_05.homework;

public class HomeworkIryna {
    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/10/20
            1.1. Исправить код ниже:
        System.out.println('\n' + "Задача 1.1.");
        int count = 0;
        doit{
          System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
        } wilhe (!(count <= 100500)); */

        System.out.println("Задача 1.1." + '\n');
        int count = 0;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
            count++;
        } while (count < 5);


        /* TODO: 8/10/20
            2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли:
            -------
           |  _ O  |
           |  ___  |
           ---------
            */
        //easy way

        System.out.println('\n' + "Задача 2.1.");
        for (int c = 0; c < 1; c++) {
            for (int d = 0; d < 1; d++) {
                System.out.println(" -------");
            }
            for (int e = 0; e < 1; e++) {
                System.out.println(" | _ 0 |");
            }
            for (int f = 0; f < 1; f++) {
                System.out.println(" | ___ |");
            }
            for (int g = 0; g < 1; g++) {
                System.out.println("---------");
            }
        }

        //hard way
        System.out.println('\n' + "Задача 2.1." + '\n');

        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 9; b++) {
                if ((a == 0 && b > 0 && b < 8) || (a == 1 && b == 3) || (a == 2 && b > 2 && b < 6) || (a == 3)) {
                    System.out.print("_");
                } else if ((a > 0 && a < 3) && (b == 0 || b == 8)) {
                    System.out.print("|");
                } else if (a == 1 && b == 5) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // Don`t understand why it doesn`t work. Somewhere mistake, I can`t find




        /* TODO: 8/10/20
            3.1. Используя конструкцию if..else реализовать:
            «Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
            да себя позабудешь» */

        System.out.println('\n' + "Задача 3.1." + '\n');

        String one = "Не ходи никуда, дома останься!";
        String two = "Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,да себя позабудешь";

        int choice = 3;
        if (choice < 3) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }

        /* TODO: 8/10/20
            4.1. Используя оператор break прервать выполнение цикла
            for(int i = 0; i < 10; i++) {
                System.out.println("Опять циклы!");
            }
            так, чтобы надпись "Опять циклы" была выведена в консоль 7 раз. */
        System.out.println('\n' + "Задача 4.1." + '\n');

        for (int i = 0; i < 10; i++) {
            while (i < 8) {
                if (i == 0) {
                    break;
                }
                System.out.println("Опять циклы!");
                i++;

            }
        }

        /* TODO: 8/10/20
            5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую,
             вторую, третью или четвертую) и выведите соответствующую надпись в консоль.  */
        System.out.println('\n' + "Задача 5.1." + '\n');

        int min;
        for (min = 0; min < 60; min++) ;
        if (min < 15) {
            System.out.println("first");
        } else if (min < 30) {
            System.out.println("second");
        } else if (min < 45) {
            System.out.println("third");
        } else {
            System.out.println("forth");
        }


        //Hard level
        /* TODO: 8/10/20
            Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
            Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

       /* System.out.println('\n' + "Задача 6.1." + '\n');

        System.out.println('\n' + "Задача Hard level");
        int[] array = new int[100];
        for (int i = 2; i < array.length; i++) {
            array[i] = i;
            if ((array[i] % 2 != 0) && (array[i] % 5 != 0)) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println('\n' + "Решение с подсчетом делителей");
        int countDivider;
        for (int i = 1; i <100; i++) {
            countDivider = 0;

            for (int i1 = 1; i1 <=i; i1++) {

                if ((i % i1) == 0) {
                    countDivider++;
                }
                if(countDivider<=2){
                    System.out.println(i);
                }

            }

        }*/
        // Doesn`t work


        /*int currentNumber, dividers;
        for (currentNumber = 1; currentNumber < 100; currentNumber++)
        {
            dividers = 0;
            for(int i = 1; i <=currentNumber; i++)
            {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <=2)
                System.out.println(currentNumber);
        }*/



    }
}


