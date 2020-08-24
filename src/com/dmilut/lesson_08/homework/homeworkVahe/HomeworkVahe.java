package com.dmilut.lesson_08.homework.homeworkVahe;

import java.lang.reflect.Array;

public class HomeworkVahe {

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

        Monkey monkey = new Monkey();
        monkey.name = "Champ";
        monkey.age = 10;
        monkey.type = "chimpanzee";
        monkey.color = "black";

        System.out.println("The monkey's name is " + monkey.name + ". The monkey's age is "
                + monkey.age + ". The monkey's type is " + monkey.type +
                ". The monkey's color is " + monkey.color);

        monkey.eat();
        monkey.sleep();
        monkey.move();

    /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark
        6.3. У созданного объекта класса Dog вызвать унаследованный метод move */

        Dog dog = new Dog();
        dog.name = "Barbos";
        dog.age = 15;
        dog.type = "Shepherd";
        dog.color = "red";

        System.out.println("The dog's name is " + dog.name + ". The dog's age is "
                + dog.age + ". The dog's type is " + dog.type +
                ". The dog's color is " + dog.color);

        dog.sleep();
        dog.move();
        dog.bark();

        // Hard level
        /* TODO: 8/20/20
            7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */

        AnimalManager animalManager = new AnimalManager();

        // Add two monkeys and one dog
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Dog dog1 = new Dog();
        monkey1.name = "Chimp";
        monkey1.age = 11;
        monkey1.type = "chimpanzee";
        monkey1.color = "gray";
        monkey2.name = "Chump";
        monkey2.age = 12;
        monkey2.type = "chimpanzee";
        monkey2.color = "brown";
        dog1.name = "Sharik";
        dog1.age = 10;
        dog1.type = "Poodle";
        dog1.color = "white";

        animalManager.addAnimal(monkey1);
        animalManager.addAnimal(monkey2);
        animalManager.addAnimal(dog1);

        System.out.println("Animals after adding 2 monkeys and a dog");

        for (int i = 0; i < animalManager.getAnimalCount(); i++) {
            animalManager.printAnimal(i);
            System.out.println();
        }

        animalManager.deleteAnimal(1);

        System.out.println("Animals after deleting 2nd monkey");

        for (int i = 0; i < animalManager.getAnimalCount(); i++) {
            animalManager.printAnimal(i);
            System.out.println();
        }

        animalManager.updateAnimal(monkey, 1);

        System.out.println("Animals after updating 2nd monkey");

        for (int i = 0; i < animalManager.getAnimalCount(); i++) {
            animalManager.printAnimal(i);
            System.out.println();
        }
    }
}

