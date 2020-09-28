package com.dmilut.lesson_18.homework.homeworkVahe;

import java.util.HashMap;

public class StudentStorage {

    private HashMap<Integer, Student> students;

    public StudentStorage(){
        students = new HashMap<Integer,Student>();
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }
}
