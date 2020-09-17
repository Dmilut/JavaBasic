package com.dmilut.lesson_15.homework.homeworkVika;

public class QueuEx {

    int[] queue = new int[5];
    int size;
    int front;
    int tail;


    public void add(int data) {
        queue[tail] = data;
        tail = (tail + 1) % 5;
        size = size + 1;
    }

    public int remove() {

        int data = queue[front];
        front = (front + 1 )% 5;
        size = size - 1;
        return data;
    }

    public void show() {

        System.out.print("Elements : ");

        for(int i = 0; i < size; i++) {

            System.out.print(queue[front + i] % 5 + " ");
        }

    }


}
