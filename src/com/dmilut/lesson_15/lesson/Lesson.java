package com.dmilut.lesson_15.lesson;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Lesson {

    public static void main(String[] args) {

        // Методы для работы со стек
        Stack<Integer> stack = new Stack<>();

        // Добавление элемента
        stack.push(0);
        stack.push(1);
        stack.push(2);
        printStack(stack);

        // Изъятие элемента
        System.out.println("pop() " + stack.pop());
        // Чтение элемента
        System.out.println("peek() " + stack.peek());
        printStack(stack);

        // Методы для работы с очередью
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        Integer test = 6;
        //Добавление в конец очереди
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        //Добавление в конец очереди
        deque.add(test);
        printDeque(deque);

        // Проверка на наличие
        System.out.println(deque.contains(test));

        // Чтение первого элемента
        System.out.println(deque.getFirst());

        // Изъятие первого элемента
        deque.pollFirst();

        // Чтение последнего элемента
        System.out.println(deque.getLast());

        // Изъятие последнего элемента
        deque.pollLast();

        printDeque(deque);
    }

    private static void printDeque(ArrayDeque<Integer> deque) {
        System.out.println("=========================");
        for (Object element : deque) {
            System.out.println(element);
        }
    }

    private static void printStack(Stack<Integer> stack) {
        System.out.println("=========================");
        for (Object element : stack) {
            System.out.println(element.toString());
        }
    }

}
