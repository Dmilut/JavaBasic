package com.dmilut.lesson_05.homework;

public class HomeworkVahe {
    public static void main(String[] args) {
        // Easy level
        /* TODO: 8/10/20
            1.1. Исправить код ниже:
        System.out.println('\n' + "Задача 1.1.");
        int count = 0;
        doit{
          System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
        } wilhe (!(count <= 100500)); */

        System.out.println('\n' + "Задача 1.1.");
        int count = 1;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count + " раз");
            count++;
        } while (!(count > 5));



        /* TODO: 8/10/20
            2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли:
            -------
           |  _ O  |
           |  ___  |
           ---------
            */

        System.out.println('\n' + "Задача 2.1.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i == 0 && j > 0 && j < 8) || (i == 3) || (i == 1 && j == 3)
                        || (i == 2 && j > 2 && j < 6)) {
                    System.out.print("_");
                } else if (i == 1 && j == 5) {
                    System.out.print("0");
                } else if (i > 0 && i < 3 && (j == 0 || j == 8)) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }

        /* TODO: 8/10/20
            3.1. Используя конструкцию if..else реализовать:
            «Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
            да себя позабудешь» */
        System.out.println('\n' + "Задача 3.1.");
        boolean left = true;
        boolean right = false;
        if (left) {
            System.out.println("Налево пойдешь - коня потеряешь");
        } else if (right) {
            System.out.println("Направо пойдешь - жизнь потеряешь");
        } else {
            System.out.println("Прямо пойдешь - жив будешь, да себя позабудешь");
        }

        /* TODO: 8/10/20
            4.1. Используя оператор break прервать выполнение цикла
            for(int i = 0; i < 10; i++) {
                System.out.println("Опять циклы!");
            }
            так, чтобы надпись "Опять циклы" была выведена в консоль 7 раз. */

        System.out.println('\n' + "Задача 4.1.");
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("Опять циклы!");
        }

        /* TODO: 8/10/20
            5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую,
             вторую, третью или четвертую) и выведите соответствующую надпись в консоль.  */

        System.out.println('\n' + "Задача 5.1.");
        for (int min = 0; min < 60; min++) {
            if (min >= 0 && min <= 14) {
                System.out.println("Minute " + min + " is in the 1st quarter!");
            } else if (min > 14 && min <= 29) {
                System.out.println("Minute " + min + " is in the 2nd quarter");
            } else if (min > 29 && min <= 44) {
                System.out.println("Minute " + min + " is in the 3rd quarter");
            } else {
                System.out.println("Minute " + min + " is  in the 4th quarter");
            }
        }


        //Hard level
        /* TODO: 8/10/20
            Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
            Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */
        System.out.println('\n' + "Задача 6.1.");
        for (int a = 2; a < 101; a++) {
            int b = 2;
            boolean prime = true;
            do {
                if (a % b == 0) {
                    prime = false;
                }
                b++;
            } while (b <= a/2);
            if (a == 2 || prime) {
                System.out.println(a);
            }
        }
    }
}
