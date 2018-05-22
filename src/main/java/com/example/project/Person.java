package com.example.project;

public class Person {
    private final int age;
    private final String typeCode;

    Person(int age, String typeCode) {
        this.age = age;
        this.typeCode = typeCode;
    }

    boolean allowed() {
        if (typeCode.equals("aa")) {
            return true;
        }
        if (age < 18) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", typeCode='" + typeCode + '\'' +
                '}';
    }

}
