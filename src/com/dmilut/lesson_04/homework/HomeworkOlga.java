package com.dmilut.lesson_04.homework;

public class HomeworkOlga {
    public static void main(String[] args) {

        //  Easy level
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

        int a = 3;
        int b = 9;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(--b);

            /*  Операторы сравнения ---------------------------------------
             ==	Проверяет, равны или нет значения двух операндов, если да, то условие становится истинным
             !=	Проверяет, равны или нет значения двух операндов, если значения не равны, то условие становится истинным
             >	Проверяет, является ли значение левого операнда больше, чем значение правого операнда, если да,
              то условие становится истинным
             <	Проверяет, является ли значение левого операнда меньше, чем значение правого операнда, если да,
              то условие становится истинным
             >=	Проверяет, является ли значение левого операнда больше или равно значению правого операнда, если да,
              то условие становится истинным
             <=	Проверяет, если значение левого операнда меньше или равно значению правого операнда, если да,
              то условие становится истинным */

        /* TODO: 2020-08-07
                2.1. Создать переменные a и b типа int
                2.2. Инициализировать переменные любыми значениями
                2.3. Написать по 2-3 примера с каждым оператором сравнения
                2.4. Вывести результат в консоль
                Пример решения:
                int a = 1;
                int b = 2;
                System.out.println("a == b = " + (a == b)); */

        int c = 3;
        int d = 9;
        System.out.println("c == d = " + (c == d));
        System.out.println("c != d = " + (c != d));
        System.out.println("c > d = " + (c > d));
        System.out.println("c <  d = " + (c < d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c <= d = " + (c <= d));
        int e = 4;
        int f = 6;
        System.out.println("e == f = " + (e == f));
        System.out.println("e != f = " + (e != f));
        System.out.println("e > f = " + (e > f));
        System.out.println("e <  f = " + (e < f));
        System.out.println("e >= f = " + (e >= f));
        System.out.println("e <= f = " + (e <= f));

                /*  Логические операторы ---------------------------------------
                &&	Называется логический оператор «И». Если оба операнда являются не равны нулю,
                    то условие становится истинным
                ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю,
                    то условие становится истинным
                !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
                    Если условие имеет значение true, то оператор логического «НЕ» будет делать false */

        /* TODO: 2020-08-07
                3.1. Создать переменные a и b типа boolean
                3.2. Инициализировать переменные любыми значениями
                3.3. Написать по 2-3 примера с каждым логическим оператором
                3.4. Вывести результат в консоль
                Пример решения:
                boolean a = true;
                boolean b = false;
                System.out.println("a && b = " + (a&&b)); */

        boolean g = true;
        boolean h = false;
        System.out.println("g && h = " + (g && h));
        System.out.println("g || h = " + (g || h));
        System.out.println("g ! h = " + (!h));
        System.out.println("g ! h = " + (!g));
        boolean i = true;
        boolean j = false;
        System.out.println("i && j = " + (i && j));
        System.out.println("i || j = " + (i || j));
        System.out.println("!i = " + (!i));
        System.out.println("! j = " + (!j));
             /*
                Операторы присваивания --------------------------------------
                =	Простой оператор присваивания, присваивает значения из правой стороны операндов
                    к левому операнду
                +=	Оператор присваивания «Добавления», он присваивает левому операнду значения правого
                -=	Оператор присваивания «Вычитания», он вычитает из правого операнда левый операнд
                *=	Оператор присваивания «Умножение», он умножает правый операнд на левый операнд
                /=	Оператор присваивания «Деление», он делит левый операнд на правый операнд
                %=	Оператор присваивания «Модуль», он принимает модуль, с помощью двух операндов и присваивает
                    его результат левому операнду */

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
        int k = 2;
        int l = 4;
        int m = 5;
        m = k + l;
        System.out.println("m = k + l = " + m);
        m += 3;
        System.out.println("m+= 3 = " + m);
        m -= 1;
        System.out.println("m-=1 = " + m);
        m *= 2;
        System.out.println("m*= 2 = " + m);
        m /= 4;
        System.out.println("m /= 4 = " + m);
        m %= 2;
        System.out.println("m%=2 = " + m);

        m += k;
        System.out.println("m+= k = " + m);
        m -= l;
        System.out.println("m-=l = " + m);
        m *= k;
        System.out.println("m*= k = " + m);
        m /= k;
        System.out.println("m /= k = " + m);
        m %= l;
        System.out.println("m%=l = " + m);


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

        String str = "Я разбираюсь в циклах!";

        for (int r = 0; r < 10; r++) {
            System.out.println(str);
        }

        int n = 0;
        while (n < 10) {
            System.out.println(str + n);
            n++;
        }

        for (int o = 0; o <= 8; o += 2) {
            System.out.println(o);
        }

        int o1 = 0;
        while (o1 <= 8) {
            System.out.println(o1);
            o1 += 2;
        }

        for (int p = 10; p >= 0; p--) {
            System.out.println(p);
        }

        int p1 = 10;
        while (p1 >= 0) {
            System.out.println(p1);
            p1--;
        }

        //  Middle level
        /* TODO: 2020-08-07
                8.1. Используя вложенныe циклы for вывести в консоль "Я люблю Java!" 10 раз */

        for (int t = 0; t < 1; t++) {
            for (int t1 = 0; t1 <= 9; t1++) {
                System.out.println("Я люблю Java!");
            }
        }

       /*       9.1. Используя цикл for со значением счетчика от 0 до 10 вывести в консоль "Ох уж эти циклы!" 5 раз */

        for (int a1 = 0; a1 < 10; a1 += 2) {
            System.out.println("Ох уж эти циклы!");
        }



        //  Hard level
        /* TODO: 2020-08-07
                10.1. Используя цикл for со значением счетчика от 0 до 10 вывести "Я действительно разбираюсь
                в циклах!" 20 раз */


        for (int a2 = 0; a2 < 10; a2++) {
            System.out.println("Я действительно разбираюсь в циклах!");
            System.out.println("Я действительно разбираюсь в циклах!");
        }


    }
}

