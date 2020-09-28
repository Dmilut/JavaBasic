package com.dmilut.lesson_18.homework.homeworkVahe;

import java.util.Arrays;

public class StudentManager {
    private StudentStorage studentStorage;

    public StudentManager(){
        studentStorage = new StudentStorage();
    }

    public void addStudent (Student student){
        studentStorage.getStudents().put(student.hashCode(),student);
    }

    public Student findStudent (Integer hash) {
        return studentStorage.getStudents().get(hash);
    }

    public void printStudent (Student student){
        System.out.println("Student found by hash is " + student.getFirstName() + " " +
                student.getLastName() + " " + student.getAge() + " years old studying in group " +
                student.getGroupNumber());
    }

    public void printAllStudents(){
        System.out.println(Arrays.asList(studentStorage.getStudents()));
    }
}
