package com.dmilut.lesson_18.homework.homeworkOlga;

public class StudentManager {

    private StudentStorage studentStorage;

    public StudentManager(){
        studentStorage = new StudentStorage();
    }

    public void addStudent (StudentInfo student){
        studentStorage.getStudents().put(student.hashCode(),student);
    }

    public StudentInfo findStudent (Integer hash) {
        return studentStorage.getStudents().get(hash);
    }

    public void printStudent (StudentInfo student){
        System.out.println("Student found is " + student.getStudentFirstName() + " " +
                student.getStudentLastName() + " " + student.getStudentAge() +
                student.getStudentGroup());
    }
    }


