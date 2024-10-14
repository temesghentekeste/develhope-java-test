package org.develhope.javatest;

public class TaxiDriver extends OutsideJob {
    private String licenseNumber;
    private String vehiclePlateNumber;

    public TaxiDriver(String name, String jobTitle, String locationType, boolean travelRequired, String licenseNumber, String vehiclePlateNumber) {
        super(name, jobTitle, locationType, travelRequired);
        this.licenseNumber = licenseNumber;
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }
}
