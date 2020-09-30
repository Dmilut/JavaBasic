package com.dmilut.lesson_18.homework.homeworkOlga;

import com.dmilut.lesson_18.homework.homeworkIryna.OwnHashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Iterator;

public class HomeworkOlga {
    StudentHash classes = new StudentHash();
     /* classes.getMyHashMap().put("Algebra",1);
        classes.getMyHashMap().put("Geometry",2);
        classes.getMyHashMap().put("Geography",3);
        classes.getMyHashMap().put("PE",4);
        classes.getMyHashMap().put("Science",5);


        classes.printHashMap();
        classes.printHashMap();
        System.out.println(classes.getMyHashMap().get("Geography"));

        classes.getMyHashMap().remove("Geography",3);
        classes.printHashMap();
        */
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent( new StudentInfo("Olga", "Lytvynova", 33,"UT-11"));
        studentManager.addStudent(new StudentInfo("Maria", "Sokolova", 31,"UT-12"));

        System.out.println("Search:");
        try {
            studentManager.printStudent(studentManager.findStudent(Integer.parseInt(inputText())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}
        //Iterator<String> iterator = hashtable.keySet().iterator();
        //while (iterator.hasNext()) {
            //String studentLastName = iterator.next();
            //StudentInfo student = hashtable.get(studentLastName);
            //if ("Lytvynova".equals(student)){
            //System.out.println(student.getStudentFirstName());}
       // }
   /* public StudentInfo searchByLastName(String studentLastName) {
        Iterator<String> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            if (student.getStudentLastName().equals(studentLastName)) {
                return student;
            }
        }

        return null;
    }
        */











