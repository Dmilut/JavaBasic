package com.dmilut.lesson_15.homework.homeworkVika;

public class HomeworkVika {

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(5);
        stack.push(2);
        stack.push(1);
        System.out.println();

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println();


        QueuEx q = new QueuEx();
        q.add(10);
        q.add(22);
        q.add(33);
        q.add(44);
        q.add(55);

        q.remove();

        q.show();


    }

}








