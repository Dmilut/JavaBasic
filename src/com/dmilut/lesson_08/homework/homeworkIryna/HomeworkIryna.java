package com.dmilut.lesson_08.homework.homeworkIryna;

public class HomeworkIryna {

    public static void main(String[] args) {

    /* TODO: 8/20/20
        4.1. Создать объект класса Animal, инициализировать его поля и вывести их значения в консоль
        4.2. У созданного объекта класса Animal вызвать методы eat, sleep и move */
        Animal animal = new Animal();
        animal.name = "Max";
        animal.age=3;
        animal.type="striped";
        animal.color="orange";


        System.out.println("Name: " + animal.name + " Age: " + animal.age + " Type: " + animal.type + " Color:" + animal.color);

        animal.eat();
        animal.sleep();
        animal.move();


    /* TODO: 8/20/20
        5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
        5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

       Monkey monkey =new Monkey();

            monkey.name="Dasha";
            monkey.age=10;
            monkey.type="ape";
            monkey.color="black";

        System.out.println("Name: " + monkey.name + " Age: " + monkey.age + " Type: " + monkey.type + " Color:" + monkey.color);
            monkey.eat();
            monkey.sleep();
            monkey.move();

    /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark*/

        Dog dog = new Dog();

        dog.name="Betty";
        dog.age=6;
        dog.type="yorkie";
        dog.color="silver";

        System.out.println("Name: " + animal.name + " Age: " + animal.age + " Type: " + animal.type + " Color:" + animal.color);

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

        dog.age = 12;
        animalManager.updateAnimal(monkey);
        animalManager.printAnimals();

        animalManager.deleteAnimal(dog);
        animalManager.printAnimals();



    }
}

