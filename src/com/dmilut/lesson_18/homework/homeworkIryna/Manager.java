package com.dmilut.lesson_18.homework.homeworkIryna;


import java.util.Arrays;

public class Manager {
    private Storage storage;

    public Manager(){
        storage = new Storage();
    }

    public void addStudent (Student student){
        storage.getStudents().put(student.hashCode(),student);
    }

    public Student findStudent (Integer hash) {
        return storage.getStudents().get(hash);
    }

    public void printStudent (Student student){
        System.out.println("Student found by hash is " + student.getFirstName() + " " +
                student.getLastName() + " " + student.getAge() + " years old studying in group " +
                student.getGroupName());
    }

    public void printAllStudents(){
        System.out.println(Arrays.asList(storage.getStudents()));
    }
}
