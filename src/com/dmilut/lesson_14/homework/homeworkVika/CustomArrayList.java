package com.dmilut.lesson_14.homework.homeworkVika;

public class CustomArrayList {

    private int SIZE = 10;
    private Object[] array;

    public CustomArrayList () {

        this.array = new Object[SIZE];
    }

    public void add(int index, Object o) {
        array[index] = o;

    }

    public void removeByIndex(int index) {

        array[index] = null;
    }

    public Object get(int index) {

        return array[index];
    }

    public void set(int index, Object element) {

        array[index] = element;
    }




}
