package com.dmilut.lesson_04.homework;

public class HomeworkOlha {
    public static void main(String[] args) {
        /* TODO: 2020-08-05
                1.1. Создать переменные a и b типа int
                1.2. Инициализировать переменные любыми значениями
                1.3. Написать по 2-3 примера с каждым арифметическим оператором
                1.4. Вывести результат в консоль
                    Пример решения:
                    int a = 1;
                    int b = 2;
                    System.out.println(a + b);
                    System.out.println(a - b); */

        int a = 2;
        int b = 4;
        System.out.println("Задача 1.");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(--b);

        /* TODO: 2020-08-07
                2.1. Создать переменные a и b типа int
                2.2. Инициализировать переменные любыми значениями
                2.3. Написать по 2-3 примера с каждым оператором сравнения
                2.4. Вывести результат в консоль
                Пример решения:
                int a = 1;
                int b = 2;
                System.out.println("a == b = " + (a == b)); */

        int c = 2;
        int d = 4;
        System.out.println('\n' + "Задача 2.");
        System.out.println("c == d = " + (c == d));
        System.out.println("c != d = " + (c != d));
        System.out.println("c > d = " + (c > d));
        System.out.println("c <  d = " + (c < d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c <= d = " + (c <= d));


        /* TODO: 2020-08-07
                3.1. Создать переменные a и b типа boolean
                3.2. Инициализировать переменные любыми значениями
                3.3. Написать по 2-3 примера с каждым логическим оператором
                3.4. Вывести результат в консоль
                Пример решения:
                boolean a = true;
                boolean b = false;
                System.out.println("a && b = " + (a&&b)); */

        boolean e = true;
        boolean f = false;
        System.out.println('\n' + "Задача 3.");
        System.out.println("e && f = " + (e && f));
        System.out.println("e || f = " + (e || f));
        System.out.println("e ! f = " + (!f));
        System.out.println("e ! f = " + (!e));

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

        int g = 6;
        int h = 8;
        int i;
        i = g + h;
        System.out.println('\n' + "Задача 4.");
        System.out.println("i = g+h = " + i);
        i += 6;
        System.out.println("i +=5 " + i);
        i -= h;
        System.out.println("i -=h " + i);
        i *= g;
        System.out.println("i *=g " + i);
        i /= h;
        System.out.println("i /=h " + i);
        i %= g;
        System.out.println("i %=g " + i);

        /* TODO: 2020-08-07
                5.1. Создать переменную String со значением "Я разбираюсь в циклах!"
                5.2. Используя цикл for вывести значение переменной в консоль 10 раз
                5.3. Сделать п.5.2. используя цикл while
                -------------------------------------------------------------------- */

        System.out.println('\n' + "Задача 5.2");
        String str = "Я разбираюсь в циклах!";
        for (int j = 0; j < 10; j++) {
            System.out.println(str + j);
        }

        System.out.println('\n' + "Задача 5.3");
        int k = 0;
        while (k < 10) {
            System.out.println(str + k);
            k++;
        }


        /* TODO: 2020-08-07
              6.1. Создать переменную int со значением 0
              6.2. Используя созданную переменную и цикл for вывести в консоль числа 0, 2, 4, 6, 8
              6.3. Сделать п.6.2. используя цикл while
              -------------------------------------------------------------------- */

        System.out.println('\n' + "Задача 6.2");
        for (int l = 0; l <= 8; l += 2) {
            System.out.println(l);
        }

        System.out.println('\n' + "Задача 6.3");
        int m = 0;
        while (m <= 8) {
            System.out.println(+m);
            m += 2;
        }

        /* TODO: 2020-08-07
            7.1. Создать переменную int со значением 10
            7.2. Используя созданную переменную и цикл for вывести в консоль числа 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
            7.3. Сделать п.7.2. используя цикл while
            -------------------------------------- */

        System.out.println('\n' + "Задача 7.2");
        for (int n = 10; n >= 0; n--) {
            System.out.println(n);
        }

        System.out.println('\n' + "Задача 7.3");
        int o = 10;
        while (o >= 0) {
            System.out.println(o);
            o--;
        }

        //  Middle level
        /* TODO: 2020-08-07
            8.1. Используя вложенныe циклы for вывести в консоль "Я люблю Java!" 10 раз
                -------------------------------------------------------------------- */
        System.out.println('\n' + "Задача 8.1");
        for (int i1 = 0; i1 <= 9; i1++) {
            System.out.println("Я люблю Java!");
        }


         /* TODO: 2020-08-07
             9.1. Используя цикл for со значением счетчика от 0 до 10 вывести в консоль "Ох уж эти циклы!" 5 раз */
        System.out.println('\n' + "Задача 9.1");
        for (int n = 0; n <= 8; n += 2) {
            System.out.println("Ох уж эти циклы!" + n);
        }

        /* TODO: 2020-08-07
             10.1. Используя цикл for со значением счетчика от 0 до 10 вывести "Я действительно разбираюсь
             в циклах!" 20 раз */
        for (int n = 0; n <= 1; n++) {
            System.out.println(n);
            for (int n1 = 0; n1 <= 9; n1++) {
                System.out.println("Я действительно разбираюсь в циклах!" + n1);
            }

        }
    }
}
