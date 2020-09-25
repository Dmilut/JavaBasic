package com.dmilut.lesson_18.homework.reference;

public class StudentStorage {

    public static Student[] students = new Student[100];

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Вася");
        student.setLastName("Иванов");

        System.out.println(student.hashCode());

        students[0] = student;

        System.out.println(sum(students));
    }

    public void put() {

    }



    public static int sum(Student[] students) {
        int sum = 0;

        for (Student student : students) {
            System.out.println(student.hashCode());

            System.out.println(Character.getNumericValue(student.hashCode()));
            //sum = sum + Character.getNumericValue(student.hashCode());

        }

        return sum;
    }

}
