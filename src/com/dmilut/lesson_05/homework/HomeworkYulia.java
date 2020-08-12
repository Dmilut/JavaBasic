package com.dmilut.lesson_05.homework;

public class HomeworkYulia {

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
        int count = 0;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
            count++;
        }
        while (count < 5);


        /* TODO: 8/10/20
            2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли:
            -------
           |  _ O  |
           |  ___  |
           ---------
            */
        System.out.println("Задача 2.1.");
        String line1 = "|  _ O  |";
        String line2 = "|  ___  |";
        String line3 = "---------";
        for (int i = 0; i < 1; i++) {
            for (int i1 = 0; i1 < 1; i1++) {
                System.out.println(line1);
                System.out.println(line2);
                System.out.println(line3);
            }
        }

        /* TODO: 8/10/20
            3.1. Используя конструкцию if..else реализовать:
            «Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
            да себя позабудешь» */
        System.out.println("Задача 3.1.");
        //String step can have different values
        String step = "right";
        if (step == "left") {
            System.out.println("Налево пойдешь - коня потеряешь");
        } else if (step == "right") {
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
        System.out.println("Задача 4.1.");
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("Опять циклы!" + i);
        }

        /* TODO: 8/10/20
            5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую,
             вторую, третью или четвертую) и выведите соответствующую надпись в консоль.  */
        System.out.println("Задача 5.1.");
        //variable min can assign different value
        int min = 9;
        if (min < 15) {
            System.out.println("It's a first quarter of an hour");
        } else if (min < 30) {
            System.out.println("It's a second quarter of an hour");
        } else if (min < 45) {
            System.out.println("It's a third quarter of an hour");
        } else if (min <= 59) {
            System.out.println("It's a fourth quarter of an hour");
        } else {
            System.out.println("Error. Please enter a number from 0 to 59");
        }


        //Hard level
        /* TODO: 8/10/20
            Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
            Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */
        System.out.println("Hard level");
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            //Checks if number is prime
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            //Prints prime numbers only
            if (isPrime) {
                System.out.println("This is prime " + n);
            }

        }


    }
}