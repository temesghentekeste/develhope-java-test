package org.develhope.javatest;

public interface Job {
    /*
    Create Job Interface which have salary, startShift,
endShift, printJobDescription, printWorkers, hirePerson,
firePerson functions.
     */
    public double salary = 0;
    void startShift();
    void endShift();
    void printJobDescription();
    void printWorkers();
    void hirePerson(Person person);
    void firePerson();


}
