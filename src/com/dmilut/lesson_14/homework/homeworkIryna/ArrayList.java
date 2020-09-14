package com.dmilut.lesson_14.homework.homeworkIryna;

public class ArrayList {
    /* TODO: 9/10/20
        2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */
    public static void main(String[] args) {
        String testString1="one";
        String testString2="two";
        String testString3="three";


        ArrayList strings = new ArrayList();
        strings.add(testString1,testString2,testString3);
        System.out.println(testString1+" "+testString2+" "+testString3);
        strings.remove(0);
        System.out.println(testString2+" "+testString3);
        strings.get(testString3);
        System.out.println(testString3);
        strings.set(2,testString3);
        System.out.println();


    }

    private void set(int i, String testString3) {
    }

    private void get(String testString3) {
    }

    private void remove(int i) {
    }

    private void add(String testString1, String testString2, String testString3) {
    }


}