package org.example;

public class Student {
    //ФИО студента
    private String fullName;

    //Возраст студента
    private int age;

    private String name;
    private String lastName;

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hello " + fullName + " you are " + age;
    }
}
