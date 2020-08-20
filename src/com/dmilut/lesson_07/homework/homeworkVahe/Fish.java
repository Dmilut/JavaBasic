package com.dmilut.lesson_07.homework.homeworkVahe;

//  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */

//1.1
public class Fish {
        //1.2
        private String name;
        private int size;
        private String color;
        private boolean edible;

        //1.3
        public double swim(double hours) {
            if(size <= 1) {
                return 10 * hours;
            }
            else if (1<size && size <=3) {
                return 20*hours;
            }
            return 25*hours;
        }

        public String eat(String food) {
            if (food == "Fish") {
                return "Carnivore";
            }
            return "Herbivore";
        }

        //1.4

        public Fish (){
        }


        //1.5
        public Fish(String name, int size, String color, boolean edible){
            this.name = name;
            this.size = size;
            this.color = color;
            this.edible = edible;
        }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean getEdible() {
        return edible;
    }
}