package org.develhope.javatest;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public abstract  class OfficeJob  implements Job{
    private String company;
    private String officeLocation;
    private boolean remoteWorkOption;

    private List<Person> personList = new ArrayList<>();


    public OfficeJob(String company, String officeLocation, boolean remoteWorkOption) {
        this.company = company;
        this.officeLocation = officeLocation;
        this.remoteWorkOption = remoteWorkOption;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public boolean isRemoteWorkOption() {
        return remoteWorkOption;
    }

    public void setRemoteWorkOption(boolean remoteWorkOption) {
        this.remoteWorkOption = remoteWorkOption;
    }

    @Override
    public void startShift() {

    }

    @Override
    public void endShift() {

    }

    @Override
    public void printJobDescription() {

    }

    @Override
    public void printWorkers() {

    }

    @Override
    public void hirePerson() {

    }

    @Override
    public void firePerson() {

    }

    public void printAllPeople() {
        if(personList.isEmpty()) {
            System.out.println("There is no any person is the list.");
            return;
        }

        System.out.println("Displaying Office Job Workers");
        for (Person person : personList) {
            System.out.println(person);
        }


    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public String toString() {
        return "OfficeJob{" +
                "name='" + company + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                ", remoteWorkOption=" + remoteWorkOption +
                ", personList=" + personList +
                '}';
    }
}
