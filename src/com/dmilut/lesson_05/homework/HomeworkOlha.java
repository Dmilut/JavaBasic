package com.dmilut.lesson_05.homework;

public class HomeworkOlha {
    public static void main(String[] args) {
// Easy level
/* TODO: 8/10/20
1.1. Исправить код ниже:
System.out.println('\n' + "Задача 1.1.");
int count = 0;
doit{
System.out.println("Напиши меня в консоли 5 раз" + " это " + count + "раз");
} wilhe (!(count <= 100500));
*/

        System.out.println("Problem 1.1.");
        int count = 1;
        do {
            System.out.println("Напиши меня в консоли 5 раз" + " это " + count + " раз");
            count++;
        } while (!(count > 5));


/* TODO: 8/10/20
2.1. Используя вложенные цикл for нарисовать следующую фигуру в консоли:
-------
| _ O |
| ___ |
---------
*/

        System.out.println("Problem 2.1.");
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 9; b++) {
                if ((a == 0 && b > 0 && b < 8) || (a == 3) || (a == 1 && b == 3)
                        || (a == 2 && b > 2 && b < 6)) {
                    System.out.print("_");
                } else if (a == 1 && b == 5) {
                    System.out.print("O");
                } else if (a > 0 && a < 3 && (b == 0 || b == 8)) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


/* TODO: 8/10/20
3.1. Используя конструкцию if..else реализовать:
«Налево пойдешь - коня потеряешь, направо пойдешь - жизнь потеряешь, прямо пойдешь - жив будешь,
да себя позабудешь» */
        System.out.println("Problem 3.1.");

        int current = 2; // стартовая позиция
        String direction; // направление движения

        if (current == 1)
            direction = "Налево пойдешь - коня потеряешь";
        else if (current == 3)
            direction = "Направо пойдешь - жизнь потеряешь";
        else
            direction = "Прямо пойдешь - жив будешь, да себя позабудешь";

        System.out.println(direction);



/* TODO: 8/10/20
4.1. Используя оператор break прервать выполнение цикла
for(int i = 0; i < 10; i++) {
System.out.println("Опять циклы!");
}
так, чтобы надпись "Опять циклы" была выведена в консоль 7 раз. */

        System.out.println("Problem 4.1.");

        for (int q = 0; q < 10; q++) {
            if (q == 7) {
                break;
            }
            System.out.println("Опять циклы!");
        }

/* TODO: 8/10/20
5.1. В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую,
вторую, третью или четвертую) и выведите соответствующую надпись в консоль. */

        System.out.println("Problem 5.1.");

        int min = 8;
        if (min >= 0 && min <= 15) {
            System.out.println("Это - первая четверть часа");
        } else if (min >= 16 && min <= 30) {
            System.out.println("Это - вторая четверть часа");
        } else if (min >= 31 && min <= 45) {
            System.out.println("Это - третья четверть часа");
        } else {
            System.out.println("Это - четвертая четверть часа");
        }

//Hard level
/* TODO: 8/10/20
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */
        System.out.println("Problem 6");

        int currentNumber, dividers;
        for (currentNumber = 1; currentNumber < 100; currentNumber++)
        {
            dividers = 0;
            for(int i = 1; i <=currentNumber; i++)
            {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <=2)
                System.out.println(currentNumber);
        }
    }
}
