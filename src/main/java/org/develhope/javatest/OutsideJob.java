package org.develhope.javatest;

public abstract class OutsideJob implements Job{

    private String name;
    private String jobTitle;
    private String locationType;
    private boolean travelRequired;


    public OutsideJob(String name, String jobTitle, String locationType, boolean travelRequired) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.locationType = locationType;
        this.travelRequired = travelRequired;
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
}
