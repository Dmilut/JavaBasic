package com.dmilut.lesson_05.homework;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkOlga {
    public static void main(String[] args) throws IOException {

        // Easy level
                /* TODO: 8/10/20
                1.1. Исправить код ниже:
                System.out.println('\n' + "Задача 1.1.");
                int count = 0;
                doit{
                System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
                } wilhe (!(count <= 100500)); */

        System.out.println('\n' + "Задача 1.1.");
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

                /* TODO: 8/10/20
                    3.1. Используя конструкцию if..else реализовать:
                    «Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
                    да себя позабудешь» */

        System.out.println('\n' + "Задача 3.1.");
        String str1 = "налево";
        if (str1.equalsIgnoreCase("Налево")) {
            System.out.println("Налево пойдешь - коня потеряешь");
        } else if (str1.equalsIgnoreCase("направо")) {
            System.out.println("направо пойдешь - жизнь потеряешь");
        } else {
            System.out.println("прямо пойдешь - жив будешь, да себя позабудешь");
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
        int min = 47;
        if (min >= 0 && min <= 14) {
            System.out.println("В первую");
        } else if (min >= 15 && min <= 30) {
            System.out.println("Во вторую");
        } else if (min >= 31 && min <= 45) {
            System.out.println("В третью");
        } else {
            System.out.println("В четвертую");
        }

        //Hard level
                /* TODO: 8/10/20
                    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
                    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

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
        for (int i = 2; i <= 100; i++) {
            countDivider = 0;

            for (int i1 = 1; i1 <= i; i1++) {

                if ((i % i1) == 0) {
                    countDivider++;
                }
            }

            if (countDivider == 2) {
                System.out.println(i);
            }
        }


        System.out.println('\n' + "Ввод данных для проекта AddressBook с консоли, пример");
        String firstName = enterText();
        String lastName = enterText();

        String[] names = new String[100];
        names[0] = firstName;
        names[1] = lastName;
        System.out.println("firstName = " + names[0]);
        System.out.println("lastName = " + names[1]);

    }

    private static String enterText() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст:");
        String name = reader.readLine();
        //System.out.println(name);
        return name;
    }
}







