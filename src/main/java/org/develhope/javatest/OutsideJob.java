package org.develhope.javatest;

import java.util.ArrayList;
import java.util.List;

public abstract class OutsideJob implements Job{

    private String company;
    private String locationType;
    private boolean travelRequired;
    private List<Person> personList = new ArrayList<>();



    public OutsideJob(String company, String locationType, boolean travelRequired) {
        this.company = company;
        this.locationType = locationType;
        this.travelRequired = travelRequired;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public boolean isTravelRequired() {
        return travelRequired;
    }

    public void setTravelRequired(boolean travelRequired) {
        this.travelRequired = travelRequired;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public void startShift() {
        System.out.println("Start shift job");

    }

    @Override
    public void endShift() {
        System.out.println("end shift job");

    }

    @Override
    public void printJobDescription() {
        System.out.println(this);

    }

    @Override
    public void printWorkers() {
        printAllPeople();
    }

    @Override
    public void hirePerson(Person person) {
        System.out.println("hired");

    }

    @Override
    public void firePerson() {
        System.out.println("Fire person");

    }

    public void printAllPeople() {
        if(personList.isEmpty()) {
            System.out.println("There is no any person is the list.");
            return;
        }

        System.out.println("Displaying Outside Job Workers");
        for (Person person : personList) {
            System.out.println(person);
        }


    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public String toString() {
        return "OutsideJob{" +
                ", locationType='" + locationType + '\'' +
                ", travelRequired=" + travelRequired +
                ", personList=" + personList +
                '}';
    }
}
