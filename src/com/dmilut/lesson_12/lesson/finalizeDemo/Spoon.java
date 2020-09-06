package com.dmilut.lesson_12.lesson.finalizeDemo;

public class Spoon {
    @Override
    protected void finalize() {
        System.out.println("Ложка исчезает навсегда");
    }
}