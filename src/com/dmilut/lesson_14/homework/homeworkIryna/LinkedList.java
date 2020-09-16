package com.dmilut.lesson_14.homework.homeworkIryna;

import com.dmilut.lesson_14.homework.reference.Node;

public class LinkedList {
    /* TODO: 9/10/20
        3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */

    private int sizeCounter;
    private Fruit head;


    public void add(Object data) {

        if (head == null) {
            head = new Fruit(data);
        }

        Object temp = new Node(data);
        Fruit current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext((Fruit) temp);

        sizeCounter++;
    }

    public void add(int index, Object data) {
        Fruit temp = new Fruit(data);
        Fruit current = head;

        if (current != null) {
            for (int i = 0; i < index && current.getNext() != null; i++) {
                current = current.getNext();
            }
        }

        temp.setNext(current.getNext());

        current.setNext(temp);

        sizeCounter++;
    }

    public Object get(int index) {

        Fruit current = null;

        if (head != null) {
            current = head.getNext();

            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }
            return current.getData();
        }

        return current;
    }

    public void remove(int index) {
        Fruit current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());

        sizeCounter--;
    }


    public int size() {
        return sizeCounter;
    }
}
