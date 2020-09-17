package com.dmilut.lesson_14.homework.homeworkIryna;

import com.dmilut.lesson_14.homework.reference.Node;

public class Fruit {
    String[]fruits={"apple","lemon","kiwi"};

    Object data;
    Fruit next;

    public Fruit(Object data) {
        next = null;
        this.data = data;
    }

    public Fruit(Object data, Fruit next) {
        this.next = next;
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Fruit getNext() {
        return next;
    }

    public void setNext(Fruit next) {
        this.next = next;
    }
}




