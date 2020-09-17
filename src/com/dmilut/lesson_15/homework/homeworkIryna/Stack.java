package com.dmilut.lesson_15.homework.homeworkIryna;

public class Stack {

     /* TODO: 9/14/20
        1.1. Реализовать custom Stack и методы push, pop и peek
     */

    private int size;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        stack = new int[this.size];
        top = -1;
    }


    public void push(int element) {
        top = top + 1;
        stack[top] = element;
    }


    public int pop() {
        top = top - 1;
        return stack[top + 1];
    }


    public int peek() {
        return stack[top];

    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i <= top; i++ ) {

            string.append(stack[i]);
            string.append(" ");
        }
        return string.toString();
    }
}
