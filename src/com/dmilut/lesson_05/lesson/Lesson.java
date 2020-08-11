package com.dmilut.lesson_05.lesson;

public class Lesson {

    public static void main(String[] args) {

        /* Синтаксис цикла do...while в Java:
            do {
                //Операторы
            } while(логическое выражение); */

        // Пример
        int i = 0;
        do {
            System.out.println("Привет!");
            i++;
        } while (i < 2);


       /* Синтаксис улучшенного цикла for:
            for(объявление : выражение) {
                //Операторы
            } */

        // Пример
        int[] array = {0, 1, 2, 3, 4};
        for (int x : array) {
            System.out.println(x);
        }

        /* Операторы принятия решений
            if	Оператор if состоит из логического выражения, после которого следует один или более операторов.
            if..else	Оператор if может сопровождаться дополнительным оператором else, который выполняется при ложном логическом выражении.
            условный (? :)	Вы можете использовать для замены операторов if...else.
            вложенный if	Вы можете использовать один оператор if или оператор if...else внутри другого или других операторов if или if...else.
            switch	Оператор switch позволяет переменной быть проверены на равенство в отношении списка значений. */

        // Пример
        int a = 1;
        int b = 3;
        if (a < b) {
            System.out.println("Привет!");
        }

        /* Синтаксис оператора if:
            if(Логическое выражение) {
                //Операторы выполняются, если истинно
            } */

         /* Синтаксис оператора if..else:
            if(Логическое выражение) {
                //Выполняется, если истинно
            } else{
                //Выполняется, если ложно
            } */

        // Пример
        int c = 1;
        int d = 3;
        if (c < d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (c < d) {
            System.out.println("true1");
        }


        /* Синтаксис тернарного оператора:
            Exp1 ? Exp2 : Exp3;
        */

        //Пример
        int e = 1;
        int f = 3;
        String name;

        if (e > f) {
            name = "Billy";
        } else {
            name = "Jimmy";
        }

        name = e > f ? "Billy" : "Jimmy";
        System.out.println(name);
    }
}
