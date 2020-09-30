package com.dmilut.lesson_18.homework.homeworkIryna;

import com.dmilut.lesson_18.homework.homeworkVahe.Student;

import java.util.HashMap;

public class Storage {

    private HashMap<Integer, com.dmilut.lesson_18.homework.homeworkVahe.Student> students;

    public Storage(){
        students = new HashMap<Integer,Student>();
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }



}
