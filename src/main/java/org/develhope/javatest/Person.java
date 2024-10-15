package org.develhope.javatest;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isHired;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    @Override
    public String toString() {
        return "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Is Hired=" + isHired +
                ", aAge=" + age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isHired == person.isHired && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, isHired);
    }
}
