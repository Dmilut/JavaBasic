package com.dmilut.lesson_15.homework.reference;

public class HomeworkReference {

    public static void main(String[] args) {

        // CustomStack тест
        CustomStack customStack = new CustomStack(10);

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        System.out.println(customStack.toString());

        System.out.println(customStack.pop());
        System.out.println(customStack.toString());

        System.out.println(customStack.peek());
        System.out.println(customStack.toString());

    }



}
