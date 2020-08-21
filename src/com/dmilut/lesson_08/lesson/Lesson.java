package com.dmilut.lesson_08.lesson;

public class Lesson {

    public static void main(String[] args) {
        String trueStudent = "Хороший студент!";
        String coolStudent = "Крутой студент!";
        boolean a = isCoolStudent(coolStudent);


        Line line = new Line();
        String lineName = line.returnLineName();

        System.out.println(lineName);

    }

    public static boolean isCoolStudent(String student) {

        String coolStudent = "Крутой студент!";
        boolean isCoolStudent = false;

        if (student.equals(coolStudent)) {
            isCoolStudent = true;
        }

        return isCoolStudent;
    }


}
