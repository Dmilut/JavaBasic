package com.dmilut.lesson_08.homework.reference;

public class HomeworkReference {
    public static void main(String[] args) {

        /* TODO: 8/20/20
            4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
            4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */

        Animal animal = new Animal();
        animal.age = 10;
        animal.color = "Green";
        animal.name = "Bob";
        animal.type = "Parrot";

        System.out.println("Name = " + animal.name + "; age = " + animal.age + "; color = " + animal.color + "; type = " + animal.type);

        animal.eat();
        animal.sleep();
        animal.move();

        /* TODO: 8/20/20
            5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
            5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey monkey = new Monkey();
        monkey.age = 5;
        monkey.color = "Brown";
        monkey.name = "Tommy";
        monkey.type = "Monkey";

        System.out.println("Name = " + monkey.name + "; age = " + monkey.age + "; color = " + monkey.color + "; type = " + monkey.type);

        monkey.eat();
        monkey.sleep();
        monkey.move();

        /* TODO: 8/20/20
            6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
            6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark */

        Dog dog = new Dog();
        dog.age = 3;
        dog.color = "Grey";
        dog.name = "Betty";
        dog.type = "Dog";

        System.out.println("Name = " + dog.name + "; age = " + dog.age + "; color = " + dog.color + "; type = " + dog.type);

        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();

        /* TODO: 8/20/20
            7.5. В классе Homework... (в своем пакете) продемонстрировать работу созданных методов */

        AnimalManager animalManager = new AnimalManager();
        animalManager.addAnimal(animal);
        animalManager.addAnimal(monkey);
        animalManager.addAnimal(dog);
        animalManager.printAnimals();

        animalManager.deleteAnimal(monkey);
        animalManager.printAnimals();

        dog.age = 5;
        animalManager.updateAnimal(monkey);
        animalManager.printAnimals();

    }
}
