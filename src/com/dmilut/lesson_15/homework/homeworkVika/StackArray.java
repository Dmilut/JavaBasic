package com.dmilut.lesson_15.homework.homeworkVika;

public class StackArray {

    // our fields int size, int[]array, int top
    // our methods isEmpty(), push(), pop(), peek()

    private int size;
    private int[] array;
    private int top;

    public StackArray(int s) {
        size = s;
        array = new int [size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int a) {
        int i = ++top;
        array[i] = a;
        System.out.println("Top is:" + " " + top);
    }

    // отрезает верхний элемен из стека
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top--];
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            System.out.println("Top is:" + " " + top);
            return array[top];
        }
    }
}
