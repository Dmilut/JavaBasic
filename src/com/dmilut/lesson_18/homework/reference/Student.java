package com.dmilut.lesson_18.homework.reference;

/*2.1. Творческое задание. Реализвать систему учета данных о студентах (Имя, Фамилия, возраст,
    название группы в которой они учатся).*/
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String group;

    public Student(String firstName, String lastName, int age, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
