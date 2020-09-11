package com.dmilut.lesson_14.lesson;

public class Lesson {

    public static void main(String[] args) {

        int[] testArray = {1, 9, 3, 7, 0, 15, 2, 28, 6, 5};

        selectionSort(testArray);

        printArray(testArray);
    }

    // Selection sort, O(n^2)
    public static void selectionSort(int[] array) {

        // Обходим все элементы
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int minIndex = i;

            // Обходим все элементы начиная с последнего отсортированного
            for (int j = i + 1; j < array.length; j++) {

                // Ищем наименьший элемент
                if (array[j] < minElement) {
                    minElement = array[j];
                    minIndex = j;
                }
            }
            // Замена текущего элемента на минимальный из оставшихся
            int temp = array[i];
            array[i] = minElement;
            array[minIndex] = temp;
        }
    }

    // Вспомогательный метод для печати массива
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
