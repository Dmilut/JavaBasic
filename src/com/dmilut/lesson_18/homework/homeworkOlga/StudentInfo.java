package com.dmilut.lesson_18.homework.homeworkOlga;

import java.util.Iterator;
import java.util.Objects;

public class StudentInfo {
    private String studentFirstName;
    private String studentLastName;
    private int studentAge;
    private String studentGroup;

    public StudentInfo(String studentFirstName, String studentLastName,int studentAge, String studentGroup ) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentFirstName(),getStudentLastName(), getStudentAge(), getStudentGroup());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentInfo)) return false;
        StudentInfo student = (StudentInfo) o;
        return getStudentFirstName().equals(student.getStudentFirstName()) &&
                getStudentLastName().equals(student.getStudentLastName()) &&
                getStudentGroup().equals(student.getStudentGroup());
    }

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
}
