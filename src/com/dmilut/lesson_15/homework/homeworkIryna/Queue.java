package com.dmilut.lesson_15.homework.homeworkIryna;

import java.util.LinkedList;

public class Queue {

    private LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
    }

    public Object peek() {
        return linkedList.peek();
    }

    public Object poll() {
        return linkedList.poll();
    }

    public boolean offer(Object o) {
        return linkedList.offer(o);
    }

    public void printQueue(String status) {
        System.out.print("Queue " + status + " update: ");
        for(int i = 0; i < linkedList.size(); i++){
            System.out.print(linkedList.get(i));
            if (i < linkedList.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
