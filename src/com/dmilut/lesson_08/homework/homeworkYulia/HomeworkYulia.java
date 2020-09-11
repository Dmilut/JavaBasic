package com.dmilut.lesson_08.homework.homeworkYulia;

public class HomeworkYulia {

    public static void main(String[] args) {

    /* TODO: 8/20/20
        4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
        4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

        Animal animal = new Animal("Some animal", 0, "unknown", "No color");
        animal.move();
        animal.eat();
        animal.sleep();

    /* TODO: 8/20/20
        5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
        5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey monkey = new Monkey("Monkeyy", 5 , "gorilla", "brown");
        System.out.println(monkey);
        monkey.eat();
        monkey.sleep();
        monkey.move();

    /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
        6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

        Dog dog = new Dog("Lucky", 1,"small breed", "white");
        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();

        // AnimalManager Work:

        AnimalManager manager = new AnimalManager();
        manager.addAnimal(new Dog("Gray", 15, "labrador", "beige"));
        manager.addAnimal(new Dog("Pink", 7, "york", "white"));
        manager.addAnimal(new Dog("Sharik", 9, "labrador", "beige"));
        manager.addAnimal(new Dog("White", 0, "labrador", "beige"));
        manager.addAnimal(new Monkey("Bet", 34, "gorila", "dark"));
        manager.printAnimals();

        manager.updateAnimal(new Dog("Gray", 111, "small", "brown"));
        manager.printAnimals();

        manager.deleteAnimal("Bet");
        manager.printAnimals();

    }
}