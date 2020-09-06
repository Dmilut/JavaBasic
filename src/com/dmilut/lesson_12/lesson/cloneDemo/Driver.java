package com.dmilut.lesson_12.lesson.cloneDemo;

public class Driver implements Cloneable {

    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }

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
}