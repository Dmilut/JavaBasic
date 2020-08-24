package com.dmilut.lesson_04.homework;

public class HomeworkIryna {
    public static void main(String[] args) {

        /*  TODO: 2020-08-05
                1.1. Создать переменные a и b типа int
                1.2. Инициализировать переменные любыми значениями
                1.3. Написать по 2-3 примера с каждым арифметическим оператором
                1.4. Вывести результат в консоль
                Пример решения:
                int a = 1;
                int b = 2;
                System.out.println(a + b);
                System.out.println(a - b); */

        int a = 30;
        int b = 13;
        int c = a + b, d = a - b, e = a * b, f = a / b, g = a % b, h = a++, i = b--;
        System.out.println("Задача 1.");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println("My answer is:" + '\n' + c + '\n' + d + '\n' + e + '\n' + f + '\n' + g + '\n' + h + '\n' + i + '\n');
        System.out.println("My answer is: " + c);
        System.out.println("My answer is: " + d);
        System.out.println("My answer is: " + e);
        System.out.println("My answer is: " + f);
        System.out.println("My answer is: " + g);
        System.out.println("My answer is: " + h);
        System.out.println("My answer is: " + i);
        System.out.println("My answer is: c, d, e, f, g, h, i");

        /* TODO: 2020-08-07
                2.1. Создать переменные a и b типа int
                2.2. Инициализировать переменные любыми значениями
                2.3. Написать по 2-3 примера с каждым оператором сравнения
                2.4. Вывести результат в консоль
                Пример решения:
                int a = 1;
                int b = 2;
                System.out.println("a == b = " + (a == b)); */

        int y = 120;
        int x = 12;
        System.out.println("Задача 2.");
        System.out.println("y==x = " + (y == x));
        System.out.println("y<=x = " + (y <= x));
        System.out.println("y>=x = " + (y >= x));
        System.out.println("y<x = " + (y < x));
        System.out.println("y>x = " + (y > x));
        System.out.println("y!=x = " + (y != x));


        /* TODO: 2020-08-07
                3.1. Создать переменные a и b типа boolean
                3.2. Инициализировать переменные любыми значениями
                3.3. Написать по 2-3 примера с каждым логическим оператором
                3.4. Вывести результат в консоль
                Пример решения:
                boolean a = true;
                boolean b = false;
                System.out.println("a && b = " + (a&&b)); */

        boolean t = true;
        boolean n = false;
        System.out.println("Задача 3.");
        System.out.println("t&&n= " + (t && n));
        System.out.println("t||n= " + (t || n));
        System.out.println("!n= " + (!n));
        System.out.println("!t= " + (!t));

        /* TODO: 2020-08-07
                4.1. Создать переменные a и b типа int
                4.2. Инициализировать переменные любыми значениями
                4.3. Написать по 2-3 примера с каждым оператором присваивания
                4.4. Вывести результат в консоль
                Пример решения:
                int a = 1;
                int b = 2;
                int c = 0;
                c = a + b;
                System.out.println("c = a + b = " + c ); */

        int l = 67;
        int p = 98;
        int u = 0;
        System.out.println("Задача 4.");
        System.out.println("l =" + (l += 67));
        System.out.println("l =" + (l -= 67));
        System.out.println("l =" + (l *= 67));
        System.out.println("l =" + (l /= 67));
        System.out.println("l =" + (l %= 67));
        System.out.println("l =" + (l = 67));
        System.out.println("p =" + (p += 98));
        System.out.println("p =" + (p -= 98));
        System.out.println("p =" + (p *= 98));
        System.out.println("p =" + (p /= 98));
        System.out.println("p =" + (p %= 98));
        System.out.println("p =" + (p = 98));
        System.out.println("u =" + (u += 0));
        System.out.println("u =" + (u -= 0));
        System.out.println("u =" + (u *= 0));
        //System.out.println("u =" + (u /= 0));   // exception because we cant divide by zero
        //System.out.println("u =" + (u %= 0));
        System.out.println("u =" + (u = 0));

         /* TODO: 2020-08-07
                5.1. Создать переменую String со значением "Я разбираюсь в циклах!"
                5.2. Используя цикл for вывести значение переменной в консоль 10 раз
                5.3. Сделать п.5.2. используя цикл while
                --------------------------------------------------------------------
                6.1. Создать переменную int со значением 0
                6.2. Используя созданную переменную и цикл for вывести в консоль числа 0, 2, 4, 6, 8
                6.3. Сделать п.6.2. используя цикл while
                --------------------------------------------------------------------
                7.1. Создать переменную int со значением 10
                7.2. Используя созданную переменную и цикл for вывести в консоль числа 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
                7.3. Сделать п.7.2. используя цикл while
                -------------------------------------------------------------------- */

        System.out.println('\n');
        String sentence = "Я разбираюсь в циклах!";
        int j;
        System.out.println("Задача 5.2.");
        for (j = 1; j <= 10; j++) {
            System.out.println(sentence);
        }

        System.out.println('\n');
        System.out.println("Задача 5.3.");
        int r = 1;
        while (r <= 10) {
            r++;
            System.out.println(sentence);
        }

        int q;
        System.out.println("Задача 6.2.");
        for (q = 0; q <= 8; q += 2) {
            System.out.println(q);
        }

        int m = 0;
        m = m - 2;
        System.out.println("Задача 6.2.");
        while (m <= 6) {
            m = m + 2;
            System.out.println(m);
        }

        int z;
        System.out.println("Задача 7.2.");
        for (z = 10; z >= 0; z--) {
            System.out.println(z);
        }

        int w = 10;
        w = w + 1;
        System.out.println("Задача 7.3.");
        while (w > 0) {
            w--;
            System.out.println(w);
        }

        //  Middle level
        /* TODO: 2020-08-07
                8.1. Используя вложенныe циклы for вывести в консоль "Я люблю Java!" 10 раз
                --------------------------------------------------------------------
                9.1. Используя цикл for со значением счетчика от 0 до 10 вывести в консоль "Ох уж эти циклы!" 5 раз */

        String cycle = "Я люблю Java!";
        System.out.println("Задача 8.");
        for (int v = 1; v <= 2; v++) {
            for (int v1 = 1; v1 <= 5; v1++) {
                System.out.println(cycle);
            }
        }

        System.out.println('\n');
        System.out.println("Задача 9.");
        String cycle20 = "Ох уж эти циклы!";
        for (int m1 = 0; m1 < 10; m1 += 2) {
            System.out.println(cycle20);
        }

        //  Hard level
        /* TODO: 2020-08-07
                10.1. Используя цикл for со значением счетчика от 0 до 10 вывести "Я действительно разбираюсь
                в циклах!" 20 раз */

        String hard = " Я действительно разбираюсь в циклах !";
        System.out.println('\n' + "Задача 10.");
        //float n1 = 0.5f;
        for (float n1 = 0f; n1 < 10; n1 = n1 + 0.5f) {
            System.out.println(hard);
        }
    }
}

