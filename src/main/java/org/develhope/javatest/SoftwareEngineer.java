package org.develhope.javatest;

public class SoftwareEngineer extends OfficeJob{
    private String company;
    private int yearsOfExperience;

    public SoftwareEngineer(String officeLocation, boolean remoteWorkOption, String company, int yearsOfExperience) {
        super(company, officeLocation, remoteWorkOption);
        this.company = company;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
