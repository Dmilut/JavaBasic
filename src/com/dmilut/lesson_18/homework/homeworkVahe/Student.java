package com.dmilut.lesson_18.homework.homeworkVahe;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String groupNumber;

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

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getGroupNumber() { return groupNumber;  }

    public void setGroupNumber(String groupNumber) { this.groupNumber = groupNumber;  }

    public Student(String firstName, String lastName, int age, String groupNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public int hashCode() {
        String result = this.firstName + this.lastName + this.age + this.groupNumber;
        char [] chars = result.toCharArray();
        int sum = 0;

        for (Character element : chars){
            sum = sum + element;
        }

        return sum;
    }
}
