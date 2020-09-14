package com.dmilut.lesson_14.homework.reference;

/* TODO: 9/10/20
    3.1. Реализовать custom Linked List (сделать свою реализацию) с методами add, remove, get, set */
public class CustomLinkedList {

    private int sizeCounter;
    private Node head;


    public void add(Object data) {

        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);

        sizeCounter++;
    }

    public void add(int index, Object data) {
        Node temp = new Node(data);
        Node current = head;

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

        Node current = null;

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
        Node current = head;

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

