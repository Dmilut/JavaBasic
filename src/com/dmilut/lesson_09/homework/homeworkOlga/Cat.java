package com.dmilut.lesson_09.homework.homeworkOlga;
<<<<<<< HEAD

/* TODO: 8/24/20
    3.1. Реализовать класс Cat наследованный от Animal
    3.2. Реализовать метод voice */
public class Cat extends Mammal {

    /* TODO: 8/24/20
        5.1. Добавить в класс Cat поля name, age, weight, type
        5.2. Реализовать геттеры и сеттеры для этих полей */

    public int weight;
    public String type;

    public Cat(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;

    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

=======
                /* TODO: 8/24/20
                3.1. Реализовать класс Cat наследованный от Animal
                3.2. Реализовать метод voice */
public class Cat extends Animal {

    @Override
    public void voice() {System.out.println("meow");
    }

                /* TODO: 8/24/20
                5.1. Добавить в класс Cat поля name, age, weight, type
                5.2. Реализовать геттеры и сеттеры для этих полей */

    public String name;
    public int age;
    public int weight;
    public String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
>>>>>>> cfb7e163d3c28aa4adea3352da09b2f87c7d97c2

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

<<<<<<< HEAD

=======
    public Cat(String name, int age, int weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;

    }
>>>>>>> cfb7e163d3c28aa4adea3352da09b2f87c7d97c2
}
