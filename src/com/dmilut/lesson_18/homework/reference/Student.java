package com.dmilut.lesson_18.homework.reference;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getFirstName().equals(student.getFirstName()) &&
                getLastName().equals(student.getLastName());
    }

    @Override
    public int hashCode() {

        String result = this.firstName + this.lastName;
        char[] chars = result.toCharArray();
        int sum = 0;

        for (Character element : chars){
            sum = sum + element;
        }

        //return Objects.hash(getFirstName(), getLastName());
        return sum;
    }
}
