package com.tipsandtricks;

import java.io.Serializable;

public class StudentClass implements Serializable {

    // Serialization
    private static final long serialVersionUID = 1L;

    // Properties
    private String name;
    private int age;
    transient int x; // Use transient in case you don't want to user see this field.

    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This is not necessary
    public StudentClass() {
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", age=" + age  +
                '}';
    }
}
