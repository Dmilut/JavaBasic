package com.dmilut.lesson_12.lesson.finalizeDemo;

public class Cup {
    private Spoon spoon;

    public Cup(Spoon spoon) {
        this.spoon = spoon;
    }

    @Override
    protected void finalize() {
        System.out.println("Чашка исчезает навсегда");
    }

}

