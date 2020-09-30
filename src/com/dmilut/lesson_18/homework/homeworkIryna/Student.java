package com.dmilut.lesson_18.homework.homeworkIryna;

import java.security.PublicKey;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String groupName;

    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName=firstName;}

    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName=lastName;}

    public int age(){return age;}
    public void setAge(int age){this.age=age;}

    public String getGroupName(){return groupName;}
    public void setGroupName(String groupName){this.groupName=groupName;}

    public Student(String firstName,String lastName,int age,String groupName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.groupName=groupName;
    }
    public int hashCode(){
        String result=firstName+lastName+age+groupName;
        char[]chars=result.toCharArray();
        int sum=0;
        for(Character element:chars){
            sum=sum+element;
        }
        return  sum;
    }
}
