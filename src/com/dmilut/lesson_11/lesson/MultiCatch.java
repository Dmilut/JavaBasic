package com.dmilut.lesson_11.lesson;

public class MultiCatch {

    public static void main(String[] args) {

        String[] catNames = {"Васька", "Барсик", "Мурзик"};
        int catNumber = 1;
        int zero = 0;

        try { // мониторим код

            // Деление на 0
            int result = catNumber / zero;

            // Добавление элемента в массив по индексу которого нет
            catNames[3] = "Рыжик";

            // Несколько catch блоков подряд
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}