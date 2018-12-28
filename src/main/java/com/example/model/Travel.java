package com.example.model;

import java.util.Date;

public class Travel {
    private String travelsNo;

    private Date travelCreatedate;

    private Date travelPaytime;

    private String driverName;

    private String driverLicenseplate;

    private Integer driverFree;

    public String getTravelsNo() {
        return travelsNo;
    }

    public void setTravelsNo(String travelsNo) {
        this.travelsNo = travelsNo == null ? null : travelsNo.trim();
    }

    public Date getTravelCreatedate() {
        return travelCreatedate;
    }

    public void setTravelCreatedate(Date travelCreatedate) {
        this.travelCreatedate = travelCreatedate;
    }

    public Date getTravelPaytime() {
        return travelPaytime;
    }

    public void setTravelPaytime(Date travelPaytime) {
        this.travelPaytime = travelPaytime;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
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