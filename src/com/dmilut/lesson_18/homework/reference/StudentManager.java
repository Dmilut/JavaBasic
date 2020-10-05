package com.dmilut.lesson_18.homework.reference;

/* TODO: 9/24/20
    2.1. Творческое задание. Реализвать систему учета данных о студентах (Имя, Фамилия, возраст,
    название группы в которой они учатся).
    2.2. Реализовать поиск студента с использованием функции хеширования.
    2.3. Сделать вывод результатов поиска в консоль. */
public class StudentManager {

    public void addStudent(Student student) {
        StudentStorage.map.put(student.getFirstName() + student.getLastName(), student);
    }

    /*2.2. Реализовать поиск студента с использованием функции хеширования.*/
    public Student searchStudentByFirstNameAndLastName(String firstName, String lastName) {
        return (Student) StudentStorage.map.get(firstName + lastName);
    }

    public void removeStudent(String firstName, String lastName) {
        StudentStorage.map.remove(firstName + lastName);
    }


}
