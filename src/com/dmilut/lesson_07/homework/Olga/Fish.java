package com.dmilut.lesson_07.homework.Olga;

public class Fish {
                    //  Easy level
                    /* TODO: 8/17/20
                    1.1. Реализовать класс Fish
                    1.2. Реализовать поля класса Fish: name, size, color, edible
                    1.3. Реализовать методы класса Fish: swim, eat
                    1.4. Создать пустой конструктор класса Fish
                    1.5. Создать конструктор класса Fish с аргументами в виде полей класса */


        public String name;
        public  int size;
        public String color;
        public boolean edible;

        public boolean swim ( String floating) {
            if (floating.equals("can float")) {
                return true;
            } else return false;
        }

        public boolean eat(String food){
            if (food.equals("dry")){
                return true;
            }
            else return false;
        }

        public Fish(){

        }
        public Fish (String name, int size, String color, boolean edible){
            this.name= name;
            this.size= size;
            this.color= color;
            this.edible= true;
        }


}

