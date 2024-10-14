package org.develhope.javatest;

public abstract  class OfficeJob  implements Job{
    private String name;
    private String jobTitle;
    private String officeLocation;
    private boolean remoteWorkOption;

    public OfficeJob(String name, String jobTitle, String officeLocation, boolean remoteWorkOption) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.officeLocation = officeLocation;
        this.remoteWorkOption = remoteWorkOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
}
