package com.example.model;

public class Driver {
    private Integer driverId;

    private String driverName;

    private Integer driverAge;

    private String driverDriverslicense;

    private Integer driverDrivingage;

    private String driverPhone;

    private String driverLicenseplate;

    private Integer driverFree;

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverDriverslicense() {
        return driverDriverslicense;
    }

    public void setDriverDriverslicense(String driverDriverslicense) {
        this.driverDriverslicense = driverDriverslicense == null ? null : driverDriverslicense.trim();
    }

    public Integer getDriverDrivingage() {
        return driverDrivingage;
    }

    public void setDriverDrivingage(Integer driverDrivingage) {
        this.driverDrivingage = driverDrivingage;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }

    public String getDriverLicenseplate() {
        return driverLicenseplate;
    }

    public void setDriverLicenseplate(String driverLicenseplate) {
        this.driverLicenseplate = driverLicenseplate == null ? null : driverLicenseplate.trim();
    }

    public Integer getDriverFree() {
        return driverFree;
    }

    public void setDriverFree(Integer driverFree) {
        this.driverFree = driverFree;
    }
}