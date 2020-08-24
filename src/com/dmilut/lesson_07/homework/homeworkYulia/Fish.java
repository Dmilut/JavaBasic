package com.dmilut.lesson_07.homework.homeworkYulia;

/* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */

public class Fish {

    public String name;
    public int size;
    public String color;
    public boolean edible;

    public void swim() {

    }

    public void eat() {

    }

    public Fish() {
        //empty constructor
    }

    public Fish(String name, boolean edible, int size, String color) {
        this.name = name;
        this.edible = edible;
        this.size = size;
        this.color = color;
    }

    /* TODO: 8/17/20
        3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
        большей рыбы */
    public static String fishCompare(Fish f1, Fish f2) {
        if (f1.size > f2.size) {
            return f1.name;
        } else if (f1.size < f2.size) {
            return f2.name;
        } else {
            return "They are equal";
        }

    }

       /*4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
    вот такого размера ..."*/

    public static String compareResults(Fish[] fishArray) {
        Fish max = fishArray[0];
        for (Fish check : fishArray) {
            if (check.size > max.size) {
                max = check;
            }

        }
        return "The biggest fish size is " + max.size;

    }
     /* 4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
    можно съесть!" или "Но ее нельзя съесть!" */

    public static void isEdible(Fish[] fishArray2) {
        for (Fish currentFish : fishArray2) {
            if (currentFish.edible) {
                System.out.println(currentFish.name + " <-- you can eat it");
            } else {
                System.out.println(currentFish.name + " <--- don't eat this fish");
            }
        }

    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", edible=" + edible +
                '}';
    }
}
