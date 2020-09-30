package com.dmilut.lesson_18.homework.homeworkIryna;

import java.util.HashMap;

public class Storage {

    private HashMap<Integer, Student> students;

    public Storage(){
        students = new HashMap<Integer,Student>();
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }



}
