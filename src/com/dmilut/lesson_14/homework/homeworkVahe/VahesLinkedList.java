package com.dmilut.lesson_14.homework.homeworkVahe;

import java.util.LinkedList;

/* TODO: 9/10/20
    3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */

public class VahesLinkedList<S> extends LinkedList{

    @Override
    public Object get(int index) {
        System.out.println("\nCalling Vahe's LinkedList get method");
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
