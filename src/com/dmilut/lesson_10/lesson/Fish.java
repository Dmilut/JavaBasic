package com.dmilut.lesson_10.lesson;

public class Fish extends Animal implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Fish swim");
    }
}
