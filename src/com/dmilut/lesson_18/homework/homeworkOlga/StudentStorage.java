package com.dmilut.lesson_18.homework.homeworkOlga;

import java.util.HashMap;

public class StudentStorage {
    private HashMap<Integer, StudentInfo> students;

    public StudentStorage(){
        students = new HashMap<Integer,StudentInfo>();
    }

    public HashMap<Integer, StudentInfo> getStudents() {
        return students;
    }
}
