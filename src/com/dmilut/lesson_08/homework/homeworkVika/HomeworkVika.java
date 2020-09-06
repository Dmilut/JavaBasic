package com.dmilut.lesson_08.homework.homeworkVika;

public class HomeworkVika {

    public static void main(String[] args) {

        Animal dog = new Animal("Fila","black",3,"dog");

        System.out.print(dog.name + " " + "Is a " + " " + dog.type+ " " + "He is a" + " " + dog.age+ " " + dog.color);

        System.out.println();

        dog.sleep();
        dog.eat();
        dog.move();


        /* TODO: 8/20/20
        5.1. Создать объект класса Monkey, инициализировать унаследованные поля и вывести их значения в консоль
        5.2. У созданного объекта класса Monkey вызвать методы eat, sleep и move */

        Monkey gorilla = new Monkey("King-Kong","black",8,"gorilla");
        System.out.print(gorilla.name + " " + "Is a " + " " + gorilla.type+ " " + "He is a" + " " + gorilla.age+ " " + gorilla.color);

        System.out.println();

        gorilla.eat();
        gorilla.sleep();
        gorilla.move();

        System.out.println();

        /* TODO: 8/20/20
        6.1. Создать объект класса Dog, инициализировать унаследованные поля и вывести их значения в консоль
        6.2. У созданного объекта класса Dog вызвать методы eat, sleep, move, bark */

        Dog myDog = new Dog("Molly","yellow",10,"yorkie");
        System.out.print("My dog name is" + " " +myDog.name+ " " + "She is a " + " " + myDog.age+ " " + "years old");

        System.out.println();
         myDog.eat();
         myDog.sleep();
         myDog.bark();

        System.out.println();








    }
}








