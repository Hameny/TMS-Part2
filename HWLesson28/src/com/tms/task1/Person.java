package com.tms.task1;

import java.util.Objects;

public abstract class Person implements Cloneable {
    private String name;
    private String surname;
    private int age;
    private String maritalStatus;

    public Person(String name, String surname, int age, String maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(maritalStatus, person.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, maritalStatus);
    }

    @Override
    public String toString() {
        return "com.tms.task1.Person{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                ", Marital status='" + maritalStatus + '\'' +
                '}';
    }
}