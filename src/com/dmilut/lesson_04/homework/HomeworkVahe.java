package com.dmilut.lesson_04.homework;

public class HomeworkVahe {
    public static void main(String[] args) {
        //Homework 2_1 Объявить переменные типа int a, b, c в 3 строки


                int a = 10;
                int b = 20;
                int c = 30;

                System.out.println("a is " + a + ", b is " + b + ", and c is " + c);


                // Homework 2_2 Объявить переменные типа char a, b, c в одну строку

                char a1 = 'a', b1 = 'b', c1 ='c';

                System.out.println("a is " + a1 + ", b is " + b1 + ", and c is " + c1);

        // Homework 2_3 Создать и инициализировать переменные a, b, c со значениями "a"; 25.5; false



                char a2 = 'a';
                float b2 = 25.5f;
                boolean c2 = false;

                System.out.println("a is " + a2 + ", b is " + b2 + ", and c is " + c2);



        //Homework 2_4 Создать и инициализировать переменные d, e, f со значениями 1; 2; 3. Присвоить значение d для e, e для f и вывести результат в консоль.

                int d = 1;
                int e = 2;
                int f = 3;
                e=d;
                f=e;

                System.out.println("d is " + d + ", e is " + e + ", and f is " + f);



        //Homework 2_5 Исправить код ниже, чтобы в консоль выводилось "d = 5":

                int a3 = 10;
                int b3 = 20;
                int c3 = 30;
                int d3 = (b3 + c3) / 10;

                System.out.println("d = " + d3);



        //Homework 2_6 Исправить код ниже, чтобы в консоль выводилось "c = 100":

                int a4 = 10;
                int b4 = 50;
                int c4 = 100;

                System.out.println("c = " + c4);



        //Homework 2_7 Исправить код ниже, чтобы в консоль выводилось "x = 3":

                int x = 6;
                int y = 3;
                x = y;

                System.out.println("x = " + 3);



        //Homework 2_8 Реализовать предложение “I have $100! But it’s not true” в виде переменных, используя оптимальные типы данных и вывести полное предложение в консоль.


                String a5 = "I have ";
                char b5 = '$';
                int c5 = 100;
                String d5 = "! But it's not ";
                boolean e5 = true;

                System.out.println(a5+b5+c5+d5+e5);



        //Homework 2_9 Закомментировать одну строчку, чтобы предложение выводимое в консоль имело смысл для суеверного человека :)

                int a6 = 1;
                int b6 = 2;
                int c6 = 3;
                a6 = a6 * b6 + c6;
                // b6 = b6 * c6 + a6;
                c6 = a6 * c6 - b6;
                System.out.println("Я не люблю это число " + c6);

        //Homework 2_10 Имеются переменные:
        //int a = 5;
        //int b = 10;
        //Поменять местами значения переменных, при этом, не используя новой переменной и не присваивая значения напрямую.

                int a7 = 5;
                int b7 = 10;
                a7=a7+b7;
                b7=a7-b7;
                a7=a7-b7;

                System.out.println("The new a is " + a7 + ", and the new b is " +b7);





    }
}
