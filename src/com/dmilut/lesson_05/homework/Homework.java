package com.dmilut.lesson_05.homework;

public class Homework {
    public static void main(String[] args) {

        // Easy level
        /* TODO: 8/10/20
            1.1. Исправить код ниже:
        System.out.println('\n' + "Задача 1.1.");
        int count = 0;
        doit{
          System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
        } wilhe (!(count
         <= 100500)); */

        /* TODO: 8/10/20
            2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли:
            -------
           |  _ O  |
           |  ___  |
           ---------
            */

        /* TODO: 8/10/20
            3.1. Используя конструкцию if..else реализовать:
            «Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
            да себя позабудешь» */

        /* TODO: 8/10/20
            4.1. Используя оператор break прервать выполнение цикла
            for(int i = 0; i < 10; i++) {
                System.out.println("Опять циклы!");
            }
            так, чтобы надпись "Опять циклы" была выведена в консоль 7 раз. */

        /* TODO: 8/10/20
            5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую,
             вторую, третью или четвертую) и выведите соответствующую надпись в консоль.  */

        //Hard level
        /* TODO: 8/10/20
            6.1. Напишите программу, которая выводит в консоль простые числа в промежутке от [2, 100].
            Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

        // Возможное решение с использованием алгоритма подсчета делителей (простое число имеет только 2 в нашем диапазоне)
        System.out.println('\n' + "Вывод в консоль простых числе от 2 до 100");
        int countDivider;                   // Переменная для подсчета делителей (счетчик)
        for (int i = 2; i <= 100; i++) {    // Внешний цикл, проходит по диапазону чисел из условия задачи 2...100
            countDivider = 2;               // Присваиваем 2 т.к. это мин кол-во делителей у любого числа в нашем диапазоне

            for (int j = 2; j < (i / 2); j++) { // Внутренний цикл, в котором проходим по всем возможным делителям числа i, исключая 1 и числа больше чем i / 2
                if (i % j == 0) {               // Проверяем, что i делится j без остатка. Если остатка нет, то j делитель i
                    countDivider++;             // Добавляем к счетчику делителей 1, если j явл-ся делителем i
                }
            }

            if (countDivider == 2) {            // Проверяем, что текущая i является простым числом через проверку кол-ва делителей
                System.out.print(" " + i);      // Если текущая i простое число - выводим в консоль
            }
        }
    }
}
