package com.dmilut.lesson_15.homework.homeworkVahe;

import java.util.Stack;

//1.1. Реализовать custom Stack и методы push, pop и peek

public class VahesStack {

    private Stack myStack;

    public VahesStack() {
        myStack = new Stack();
    }

    public void push(Object o) { myStack.push(o); }

    public Object pop() {
        return myStack.pop();
    }

    public Object peek() { return myStack.peek(); }

    public boolean empty() {
        return myStack.isEmpty();
    }

    public void printStack(String status) {
        System.out.print("Print stack " + status + " pop: ");
        for(int i = 0; i < myStack.size(); i++){
            System.out.print(myStack.get(i));
            if (i < myStack.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
