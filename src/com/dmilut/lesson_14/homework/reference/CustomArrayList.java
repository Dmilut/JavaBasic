package com.dmilut.lesson_14.homework.reference;

/* TODO: 9/10/20
    2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set */
public class CustomArrayList {

    private Object[] objects;
    private final int DEFAULT_ARRAY_LENGTH = 5;

    // Инициализация внутреннего массива через конструктор с размером по умолчанию
    public CustomArrayList() {
        objects = new Object[DEFAULT_ARRAY_LENGTH];
    }

    // Инициализация внутреннего массива через конструктор с заданным размером
    public CustomArrayList(int length) {
        objects = new Object[length];
    }

    // Реализация метода add
    public void add(Object element) {
        int index = getFirstEmptySlotIndex();

        if (index == objects.length - 1) {
            expandArray();
        }

        objects[index] = element;
    }

    // Реализация метода remove - удаление элемента по известному индексу
    public void removeByIndex(int index) {

        objects[index] = null;
    }

    // Реализация метода remove - удаление элемента по объекту
    public void removeByElement(Object element) {
        int index = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(element)) {
                index = i;
                break;
            }
        }

        objects[index] = null;
    }

    // Реализация метода get
    public Object get(int index) {

        return objects[index];
    }

    // Реализация метода set
    public void set(int index, Object element) {

        objects[index] = element;
    }

    // Реализация метода length
    public int length() {
        return objects.length;
    }

    // Вспомогательный метод, возвращает первый пустой слот
    private int getFirstEmptySlotIndex() {
        int index = 0;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    // Вспомогательный метод, увеличивает размер внутреннего массива
    private void expandArray() {
        Object[] tempArray = new Object[this.objects.length + DEFAULT_ARRAY_LENGTH];

        for (int i = 0; i < this.objects.length; i++) {
            tempArray[i] = this.objects[i];
        }

        this.objects = tempArray;
    }


}
