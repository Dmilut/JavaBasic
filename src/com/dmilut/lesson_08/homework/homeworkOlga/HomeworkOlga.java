package com.dmilut.lesson_08.homework.homeworkOlga;

public class HomeworkOlga {
                    /* TODO: 8/20/20
                    4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
                    4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

    public static void main(String[] args) {

        Animal cat = new Animal("Cat Molly", 2, "domestic", "grey");
        System.out.println();
        System.out.println(cat.name + " is " + cat.age + ". It is a " + cat.type + " animal. Her color is " + cat.color);
        cat.move();
        cat.sleep();
        cat.eat("milk");

                    /* TODO: 8/20/20
                    5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
                    5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey monkey = new Monkey("Monkey Lily", 5, "wild", "brown");
        System.out.println();
        System.out.println(monkey.name + " is " + monkey.age + ". It is a " + monkey.type + " animal. Her color is " + monkey.color);
        monkey.move();
        monkey.sleep();
        monkey.eat("banana");

                    /* TODO: 8/20/20
                    6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
                    6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
                    6.3. У созданного объекта класса Dog вызвать унаследованный метод move */


        Dog dog = new Dog("Dog Boy", 4, "domestic", "white");
        System.out.println();
        System.out.println(dog.name + " is " + dog.age + ". It is a " + dog.type + " animal. His color is " + dog.color);
        dog.move();
        dog.sleep();
        dog.eat("bone");
        dog.bark();
        }
    }














