package com.dmilut.lesson_18.homework.reference;

import java.util.HashMap;

public class HomeworkReference {

    public static void main(String[] args) {

        // Тест customHashMap
        CustomHashMap map = new CustomHashMap();
        map.put("Test1", 1);
        map.put("Test2", 2);
        map.put("Test3", 3);
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        map.remove("Test2");
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        // Тест системы учета студентов
        Student student1 = new Student("Иван", "Иванов", 20, "115");
        Student student2 = new Student("Василий", "Васильев", 22, "320");
        Student student3 = new Student("Анна", "Каренина", 21, "221");

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.removeStudent("Василий", "Васильев");

        for (String key : StudentStorage.map.keySet()) {
            System.out.println(StudentStorage.map.get(key));
        }

        /*2.3. Сделать вывод результатов поиска в консоль.*/
        System.out.println(studentManager.searchStudentByFirstNameAndLastName("Анна", "Каренина"));


    }


}
