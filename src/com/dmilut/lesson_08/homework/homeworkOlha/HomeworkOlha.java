package com.dmilut.lesson_08.homework.homeworkOlha;

public class HomeworkOlha {



           /* TODO: 8/20/20
               4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
               4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

    public static void main(String[] args) {

        Animal animal = new Animal ();

        animal.name = "Kaa";
        animal.age = 100;
        animal.species ="Python";
        animal.color ="Green";

        animal.move();
        animal.eat ();
        animal.sleep();


            /* TODO: 8/20/20
                5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
                5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey monkey = new Monkey ();

        monkey.name = "Loui";
        monkey.age = 20;
        monkey.species ="Ape";
        monkey.color ="Brown";

        monkey.move();
        monkey.eat ();
        monkey.sleep();

           /* TODO: 8/20/20
               6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
               6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
               6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

        Dog dog = new Dog ();

        dog.name = "Browney";
        dog.age = 2;
        dog.species ="Husky";
        dog.color ="Brown";

        dog.move();
        dog.eat ();
        dog.sleep();
        dog.bark();


    }
}
