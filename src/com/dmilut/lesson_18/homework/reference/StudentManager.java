package com.dmilut.lesson_18.homework.reference;

public class StudentManager {

     /* TODO: 9/24/20
        2.1. Творческое задание. Реализвать систему учета данных о студентах (Имя, Фамилия, возраст,
        название группы в которой они учатся).
        2.2. Реализовать поиск студента с использованием функции хеширования.
        2.3. Сделать вывод результатов поиска в консоль. */

    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("Вася");
        student.setLastName("Иванов");

        System.out.println(student.hashCode());

    }

}
