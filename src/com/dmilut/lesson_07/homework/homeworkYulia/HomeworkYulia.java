package com.dmilut.lesson_07.homework.homeworkYulia;

public class HomeworkYulia {

    public static void main(String[] args) {

         /* TODO: 8/17/20
            2.1. Создать экземпляр класса Fish используя пустой конструктор
            2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

        Fish fish = new Fish();
        Fish fish2 = new Fish("Gold fish", false, 2, "gold");
        Fish fish3 = new Fish("Silver fish", true, 5, "silver");

        System.out.println(Fish.fishCompare(fish2, fish3));


        //  Hard level
        /* TODO: 8/17/20
            4.1. Создать массив Fish
            4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями*/


        Fish[] arrFish = {
                new Fish("Salmon", true, 20, "gray"),
                new Fish("Steelhead", true, 15, "red"),
                new Fish("Tilapia", true, 12, "pink"),
                new Fish("Fugu", false, 9, "white/silver")

        };

        System.out.println(Fish.compareResults(arrFish));
        Fish.isEdible(arrFish);


    }
}