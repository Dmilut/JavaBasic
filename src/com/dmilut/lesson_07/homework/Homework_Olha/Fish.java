package com.dmilut.lesson_07.homework.Homework_Olha;

//  Easy level
        /* TODO: 8/17/20
            1.1. Реализовать класс Fish
            1.2. Реализовать поля класса Fish: name, size, color, edible
            1.3. Реализовать методы класса Fish: swim, eat
            1.4. Создать пустой конструктор класса Fish
            1.5. Создать конструктор класса Fish с аргументами в виде полей класса */
//1.1 class
 class Fish {
     //1.2 fields
     String name;
     float size;
     String color;
     Boolean edible;
     //1.3 method
     void swim() {
         System.out.println("Let's swim!");
      }
        void eat() {
         System.out.println("I'm hungry");
      }
 }

          //1.4 constructor
            Fish (String name, float size, String color, boolean edible) {
          //1.5 arguments
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

            /* TODO: 8/17/20
                2.1. Создать экземпляр класса Fish используя пустой конструктор
                2.2. Создать экземпляр класса Fish используя конструктор для инициализации полей */

              Fish myFish= new Fish ();
              Fish myFish ("seabass", 12, "gray");





        /* TODO: 8/17/20
            3.1. Создать static метод, который будет сравнивать размер двух рыб и выводить в консоль название
            большей рыбы */
            public static String bigFish(Fish fish1, Fish fish2){
                if(fish1.getSize() < fish2.getSize()){
                    return fish2.getName();
                }
                return fish1.getName();
            }


    //  Hard level
        /* TODO: 8/17/20
            4.1. Создать массив Fish
            4.2. Заполнить массив 5 произвольными объектами Fish с инициализированными полями
            4.3. Создать static метод, который будет искать самую большую рыбу и выводить в консоль текст вида "Эта рыба
             вот такого размера ..."
            4.4. Создать static метод, который будет проверять съедобна эта рыба или нет и выводить в консоль "И ее
             можно съесть!" или "Но ее нельзя съесть!" */

