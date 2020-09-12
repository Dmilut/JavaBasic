package com.dmilut.lesson_14.homework.homeworkVahe;

import java.util.ArrayList;

/* TODO: 9/10/20
    2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */

public class VahesArrayList<I extends Number> extends ArrayList {

    @Override
    public Object get(int index) {
        System.out.println("\nCalling Vahe's ArrayList get method");
        return super.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        System.out.println("\nCalling Vahe's ArrayList set method");
        return super.set(index, element);
    }

    @Override
    public void add(int index, Object element) {
        System.out.println("\nCalling Vahe's ArrayList add method");
        super.add(index, element);
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("\nCalling Vahe's ArrayList remove method");
        return super.remove(o);
    }
}
