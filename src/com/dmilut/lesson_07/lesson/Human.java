package com.dmilut.lesson_07.lesson;
class Human {
    public char sex;
    public int age;
    public int height;
    public int weight;

    public Human (){
    }

    public Human(char sex, int age){
        this.sex = sex;
        this.age = age;
    }
    {
        int b = 10;
        //System.out.println(b);
    }

    public boolean isPlaying(String ballColor){
        if(ballColor.equals("green")){
            return true;
        }
        return false;

    }
}
