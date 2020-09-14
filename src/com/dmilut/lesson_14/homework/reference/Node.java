package com.dmilut.lesson_14.homework.reference;

// Элемент custom Linked List
public class Node {

    Object data;
    Node next;

    public Node(Object data) {
        next = null;
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

