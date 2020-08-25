package com.dmilut.lesson_08.homework.homeworkRam;

public class HomeworkRam {

    public static void main(String[] args) {

        /* TODO: 8/20/20
            4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
            4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.move();

        /* TODO: 8/20/20
            5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
            5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey bigmonkey = new Monkey();
        bigmonkey.name = "King Kong";
        bigmonkey.age = 14;
        bigmonkey.color = "Black";
        bigmonkey.type = "Gorila";

        System.out.println(bigmonkey.name + bigmonkey.age + bigmonkey.color + bigmonkey.name);


      /*  System.out.println(bigmonkey.move());
        System.out.println(bigmonkey.eat());
        System.out.println(bigmonkey.sleep()); */

        /* TODO: 8/20/20
            6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
            6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
            6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

        Dog smalldog = new Dog();
        smalldog.name = "Tuzik";
        smalldog.age = 3;
        smalldog.color = "Brown";
        smalldog.type = "Doberman";

        System.out.println(smalldog.name + smalldog.age + smalldog.color + smalldog.name);


       /* System.out.println(smalldog.move());
        System.out.println(smalldog.eat());
        System.out.println(smalldog.sleep()); */

    }
}





