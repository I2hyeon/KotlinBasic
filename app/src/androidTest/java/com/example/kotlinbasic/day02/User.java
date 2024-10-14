package com.example.kotlinbasic.day02;

public class User {
    // convert to kotlin

    public String name;
    public int age;

    public User(String name) {
       this.name = name;
       this.age = 1;
    }

    public User(String name, int age) {
        this(name);
        this.age = age;
    }
}
