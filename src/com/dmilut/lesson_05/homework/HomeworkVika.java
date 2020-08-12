package com.dmilut.lesson_05.homework;

public class HomeworkVika {

    public static void main(String[] args) {

        System.out.println('\n' + "Задача 1.1.");
        int count = 0;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
            count++;
        } while (count < 5);

        System.out.println(" 2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли");

        //System.out.println(" -------");
        //System.out.println(" | _ 0 |");
        //System.out.println(" | ___ |");
        //System.out.println("---------");

        for(int i = 1; i <= 1; i++) {
            for(int a = 1; a <= 1; a++  ) {
                System.out.println(" -------");
            }
            for(int b = 1; b <=1; b++) {
                System.out.println(" | _ 0 |");
            }for(int c = 1; c <=1; c++) {
                System.out.println(" | ___ |");
            } for(int d =1; d <= 1; d++) {
                System.out.println("---------");
            }
        }

        System.out.println("3.1. Используя конструкцию if..else реализовать:");

        int a = 1;
        int b = 5;

        if(a > b) {
            System.out.println("Налево пойдешь - коня потеряешь");
        }if (a < b) {
            System.out.println("направо пойдешь - жизнь потеряешь");
        }else {
            System.out.println("прямо пойдешь - жив будешь,да себя позабудешь");
        }

        System.out.println("4.1. Используя оператор break прервать выполнение цикла");

        for(int i = 0; i < 10; i++) {
            System.out.println("Опять циклы!");
            if (i == 6){
                break;
            }
        }

        System.out.println("5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число");

        int min = 10;
        if (min >= 0 && min <= 14) {
            System.out.println("В первую четверть.");
        }
        if (min >= 15 && min <= 30) {
            System.out.println("Во вторую четверть.");
        }
        if (min >= 31 && min <= 45) {
            System.out.println("В третью четверть.");
        }
        if (min >= 46 && min <= 59) {
            System.out.println("В четвертую четверть.");
        }

        System.out.println( " 6.1 Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].");

        int x, y;
        for (x = 1; x <101; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2)
                System.out.println(x);

        }
    }
}








