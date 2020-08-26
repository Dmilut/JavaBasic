package com.dmilut.lesson_09.homework.homeworkVahe;

/* TODO: 8/24/20
        3.1. Объявить класс Cat наследованный от Animal
        3.2. Объявить метод voice */

    public class Cat extends Animal {

        @Override
        public void voice() {
            System.out.println("Meow");
        }


/* TODO: 8/24/20
        5.1. Добавить в класс Cat поля name, age, weight, type
        5.2. Реализовать геттеры и сеттеры для этих полей */

        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        private int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        private int weight;
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }

        private String type;
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
    }









