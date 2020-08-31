package com.dmilut.lesson_09.homework.homeworkOlga;

public class Mammal extends Animal {

    public int age;
    public String name;

    @Override
    public void voice() {
        System.out.println("Mammal voice!");
    }
}
