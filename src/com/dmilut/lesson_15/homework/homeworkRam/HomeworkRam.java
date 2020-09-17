package com.dmilut.lesson_15.homework.homeworkRam;

import java.util.ArrayDeque;
import java.util.Stack;

public class HomeworkRam {

    public static void main(String[] args) {

        System.out.println("1.1. Реализовать custom Stack и методы push, pop и peek");

        Stack stack = new Stack();

        System.out.println("Stack is empty?" + " " + stack.empty());

        stack.push(8);
        stack.push(48);
        stack.push(89);
        stack.push(458);
        stack.push(23);
        stack.push(54);

        System.out.println("Stack is empty?" + " " + stack.empty());

        if (!stack.empty()) {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.peek());
        }
        System.out.println("Stack is empty?" + " " + stack.empty());


        System.out.println(" 2.1. Реализовать custom Queue и методы для добавления, изъятия и чтения элемента");

        ArrayDeque<String> deque = new ArrayDeque<>();

        System.out.println("Deque is empty?" + " " + deque);

        String MyTest = "Summer";

        deque.addFirst("First");
        deque.addLast("Second");
        deque.addFirst("Hi + 3");
        deque.addLast("Hi + 4");
        deque.add(MyTest);
//        deque.clear();
//        Я понял как работает deque.clear() но не понял что происходит c deque.clone()


        System.out.println("Deque is empty?" + " " + deque.isEmpty());

        for (Object element : deque) {
            System.out.println(element);
        }


        System.out.println(deque.contains(MyTest));

        System.out.println("First Element" + " " + deque.getFirst());
        System.out.println("Last  Element" + " " + deque.getLast());

        deque.pollFirst();
        System.out.println("Last Element" + " " + deque.getLast());

        System.out.println("Last Element" + " " + deque.peekLast());

//        я не совсем понял в чем разница getLast и peekLast


    }
}





