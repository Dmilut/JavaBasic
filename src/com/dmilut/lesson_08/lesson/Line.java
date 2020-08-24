package com.dmilut.lesson_08.lesson;

public class Line extends Shape {

    @Override
    public void draw() {
        super.draw();
        System.out.println("Линия");
    }

    public String returnLineName() {
        String lineNameMethod = "lineNameMethod";

        System.out.println("Что угодно!");

        return lineNameMethod;
    }

}
