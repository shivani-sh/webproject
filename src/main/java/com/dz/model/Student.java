package com.dz.model;

public class Student {
    private  String name;
    private int id;
    private int age;
    public  Student(){

    }

    public Student (int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
