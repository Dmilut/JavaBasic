package com.dmilut.lesson_09.homework.homeworkRam;

public class Cat extends Animal {

    @Override
    public void voice() {
    }

    String name;
    int age;
    int weight;
    String type;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
