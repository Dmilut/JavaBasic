package com.dmilut.lesson_15.homework.homeworkVahe;

import java.util.LinkedList;
import java.util.Arrays;

public class HomeworkVahe {

    public static void main(String[] args) {

        /* TODO: 9/14/20
        1.1. Реализовать custom Stack и методы push, pop и peek */

        // Custom Stack test

        System.out.println("This is the custom Stack test:");

        VahesStack testStack = new VahesStack();

        testStack.push(0);
        testStack.push(2);
        testStack.push(4);
        testStack.push(6);
        testStack.push(8);
        testStack.push(10);
        testStack.push(12);
        testStack.push(14);
        testStack.push(16);


        testStack.printStack("before");

        System.out.println("pop => " + testStack.pop());
        System.out.println("pop => " + testStack.pop());
        System.out.println("pop => " + testStack.pop());

        testStack.printStack("after");

        System.out.println("Number on top (The peek) of the stack is => " + testStack.peek());

        System.out.println("Is the stack empty?  The answer is: " + testStack.empty());


        /* TODO: 9/14/20
        2.1. Реализовать custom Queue и методы добавления, изъятия и чтения элемента */

        // Custom Queue test

        System.out.println("\nThis is the custom Queue test:");

        VahesQueue testQueue = new VahesQueue();

        testQueue.offer(1);
        testQueue.offer(2);
        testQueue.offer(3);

        testQueue.printQueue("before");

        int accessedNumber = (int) testQueue.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = (int) testQueue.poll();
        System.out.println("Removed Element: " + removedNumber);

        testQueue.printQueue("after");
    }
}











