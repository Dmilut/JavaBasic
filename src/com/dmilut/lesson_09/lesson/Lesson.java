package com.dmilut.lesson_09.lesson;

public class Lesson {

    public static void main(String[] args) {

        Dog dog = new Dog("Betty");

        System.out.println(dog.getName());

        dog.setName("Nord");

        System.out.println(dog.getName());
    }

}
