package com.dmilut.lesson_18.homework.homeworkVahe;

import java.util.HashMap;
import java.util.Arrays;

public class VahesHashMap {

    private HashMap<String, Integer> myHashMap;

    public VahesHashMap(){
        myHashMap = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getMyHashMap() {
        return myHashMap;
    }

    public void setMyHashMap(HashMap<String, Integer> myHashMap) {
        this.myHashMap = myHashMap;
    }

    public void printHashMap(){
        System.out.println(Arrays.asList(myHashMap));
    }
}
