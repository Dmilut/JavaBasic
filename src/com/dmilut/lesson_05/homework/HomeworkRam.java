package com.dmilut.lesson_05.homework;

public class HomeworkRam {

    public static void main(String[] args) {
//
//        Задача 1.1.

        int count = 0;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count++ + "раз");
        }
        while (count <= 4);


//        Задача 2

        int i = 0;

        for (; i < 1; i++) {
            System.out.println("|  _ O  |");
            for (; i < 1; i++) {
                System.out.println("|  ___  |");

            }

        }


//        Задача 3

        int q = 0;

        for (; q < 1; q++) {
            if (q == 0) ;
            System.out.println("Налево пойдешь - коня потеряешь");
            if (q == 1) ;
            System.out.println("направо пойдешь - жизнь потеряешь");
            if (q == 2) ;
            System.out.println("прямо пойдешь - жив будешь,\n" + "да себя позабудешь");


//        Задача 4

            for (int i1 = 0; i < 10; i++) {
                if (i1 >= 7) {
                    break;
                }
                System.out.println("Опять циклы!");


            }


//            Задача 5

            int min = 0;

            for (; min <= 59; min++) {
                if (min >= 0 && min <= 15) {
                    System.out.println(min + " " + "is a First quarter");
                } else if (min > 15 && min < 29) {
                    System.out.println(min + " " + "is a Second quarter");
                } else if (min > 30 && min < 45) {
                    System.out.println(min + " " + "is a Third quarter");
                } else if (min > 45 && min <= 59) {
                    System.out.println(min + " " + "is a Fourth quarter");
                }
            }
        }



//                Задача 6
        int w = 2;
        int r = 2;
          for (; w <= 100; w++) {
             if (w % r == 0 && w % w == 0) {
                 System.out.println(w);




                        }
                    }
                }
            }

