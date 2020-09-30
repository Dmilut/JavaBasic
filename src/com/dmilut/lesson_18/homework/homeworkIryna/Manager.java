package com.dmilut.lesson_18.homework.homeworkIryna;

import com.dmilut.lesson_18.homework.homeworkVahe.Student;
import com.dmilut.lesson_18.homework.homeworkVahe.StudentStorage;

import java.util.Arrays;

public class Manager {
    private Storage Storage;

    public Manager(){ Storage = new Storage();
    }

    public void addStudent (com.dmilut.lesson_18.homework.homeworkVahe.Student student){
        Storage.getStudents().put(student.hashCode(),student);
    }

    public com.dmilut.lesson_18.homework.homeworkVahe.Student findStudent (Integer hash) {
        return Storage.getStudents().get(hash);
    }

    public void printStudent (Student student){
        System.out.println("Student found by hash is " + student.getFirstName() + " " +
                student.getLastName() + " " + student.getAge() + " years old studying in group " +
                student.getGroupNumber());
    }

    public void printAllStudents(){
        System.out.println(Arrays.asList(Storage.getStudents()));
    }
}
