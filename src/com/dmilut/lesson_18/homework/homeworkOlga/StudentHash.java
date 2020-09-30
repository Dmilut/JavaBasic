package com.dmilut.lesson_18.homework.homeworkOlga;

import java.util.Arrays;
import java.util.HashMap;

public class StudentHash {
    private HashMap<String, Integer> studentHashMap;

    public StudentHash(){
        studentHashMap = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getMyHashMap() {
        return studentHashMap;
    }

    public void setStudentHashMap(HashMap<String, Integer> myHashMap) {
        this.studentHashMap = myHashMap;
    }

    public void printHashMap(){
        System.out.println(Arrays.asList(studentHashMap));
    }
}
