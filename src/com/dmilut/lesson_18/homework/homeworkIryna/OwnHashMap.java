package com.dmilut.lesson_18.homework.homeworkIryna;

import java.util.Arrays;
import java.util.HashMap;

public class OwnHashMap {

    public Object getMyHashMap;
    private HashMap<String, Integer> myHashMap;
    public OwnHashMap() {
        myHashMap=new HashMap<String, Integer>();
    }
    public HashMap<String, Integer> getMyHashMap() {
        return myHashMap;
    }
    public  void setMyHashMap(HashMap<String,Integer>myHashMap){
        this.myHashMap=myHashMap;
    }

    public void printHashMap(){
        System.out.println(Arrays.asList(myHashMap));
    }
}
