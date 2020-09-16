package com.dmilut.lesson_15.homework.reference;

/* TODO: 9/14/20
    1.1. Реализовать custom Stack и методы push, pop и peek */
public class CustomStack {

    private int size;
    private int[] stack;
    private int top;

    // Конструктор
    public CustomStack(int size) {
        this.size = size;
        stack = new int[this.size];
        top = -1;
    }

    // Добавление элемента
    public void push(int element) {
        top = top + 1;
        stack[top] = element;
    }

    // Удаление / изъятие элемента
    public int pop() {
        top = top - 1;
        return stack[top + 1];
    }

    // Чтение элемента
    public int peek() {
        return stack[top];

    }

    // Вспомогательный метод для представления данных stack в виде строки
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

