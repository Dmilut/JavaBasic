package com.dmilut.lesson_14.homework.homeworkIryna;

public class ArrayList {

 /*TODO: 9/10/20
        2.1. Реализовать custom Array List (сделать свою реализацию) с методами add, remove, get, set
*/

        private Fruit[] fruits;
        private final int DEFAULT_ARRAY_LENGTH = 3;


        public ArrayList() {
          fruits = new Fruit[DEFAULT_ARRAY_LENGTH];
        }


        public ArrayList(int length) {
          fruits = new Fruit[length];
        }


        public void add(Fruit element) {
            int index = getFirstEmptySlotIndex();

            if (index == fruits.length - 1) {
                expandArray();
            }

            fruits[index] =(Fruit) element;
        }


        public void removeByIndex(int index) {

            fruits[index] = null;
        }


        public void removeByElement(Fruit element) {
            int index = 0;
            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i].equals(element)) {
                    index = i;
                    break;
                }
            }

            fruits[index] = null;
        }


        public Fruit get(int index) {

            return fruits[index];
        }


        public void set(int index, Fruit element) {

            fruits[index] = (Fruit)element;
        }


        public int length() {
            return fruits.length;
        }


        private int getFirstEmptySlotIndex() {
            int index = 0;

            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i] == null) {
                    index = i;
                    break;
                }
            }
            return index;
        }


        private void expandArray() {
            Fruit[] tempArray = new Fruit[this.fruits.length + DEFAULT_ARRAY_LENGTH];

            for (int i = 0; i < this.fruits.length; i++) {
                tempArray[i] = this.fruits[i];
            }

            this.fruits = (Fruit[]) tempArray;
        }

    }
