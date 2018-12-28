package com.example.model;

public class Logistics {
    private Integer logisticsId;

    private String logisticssOdd;

    private Integer driverId;

    private String logisticeInitialaddress;

    private String logisticeRelayaddress;

    private String logisticeTargetaddress;

    private byte[] driverPhone;

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticssOdd() {
        return logisticssOdd;
    }

    public void setLogisticssOdd(String logisticssOdd) {
        this.logisticssOdd = logisticssOdd == null ? null : logisticssOdd.trim();
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getLogisticeInitialaddress() {
        return logisticeInitialaddress;
    }

    public void setLogisticeInitialaddress(String logisticeInitialaddress) {
        this.logisticeInitialaddress = logisticeInitialaddress == null ? null : logisticeInitialaddress.trim();
    }

    public String getLogisticeRelayaddress() {
        return logisticeRelayaddress;
    }

    public void setLogisticeRelayaddress(String logisticeRelayaddress) {
        this.logisticeRelayaddress = logisticeRelayaddress == null ? null : logisticeRelayaddress.trim();
    }

    public String getLogisticeTargetaddress() {
        return logisticeTargetaddress;
    }

    public void setLogisticeTargetaddress(String logisticeTargetaddress) {
        this.logisticeTargetaddress = logisticeTargetaddress == null ? null : logisticeTargetaddress.trim();
    }

    public byte[] getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(byte[] driverPhone) {
        this.driverPhone = driverPhone;
    }
}