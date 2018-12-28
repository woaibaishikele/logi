package com.example.model;

import java.math.BigDecimal;

public class BetailOrder {
    private String dordersNo;

    private Integer dordersNumber;

    private Integer dordersMode;

    private Integer orderState;

    private Integer dordersInspection;

    private String dordersAddress;

    private String dordersUser;

    private String payableUser;

    private String orderPhone;

    private Integer logisticsId;

    private BigDecimal logisticspriceTprice;

    public String getDordersNo() {
        return dordersNo;
    }

    public void setDordersNo(String dordersNo) {
        this.dordersNo = dordersNo == null ? null : dordersNo.trim();
    }

    public Integer getDordersNumber() {
        return dordersNumber;
    }

    public void setDordersNumber(Integer dordersNumber) {
        this.dordersNumber = dordersNumber;
    }

    public Integer getDordersMode() {
        return dordersMode;
    }

    public void setDordersMode(Integer dordersMode) {
        this.dordersMode = dordersMode;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getDordersInspection() {
        return dordersInspection;
    }

    public void setDordersInspection(Integer dordersInspection) {
        this.dordersInspection = dordersInspection;
    }

    public String getDordersAddress() {
        return dordersAddress;
    }

    public void setDordersAddress(String dordersAddress) {
        this.dordersAddress = dordersAddress == null ? null : dordersAddress.trim();
    }

    public String getDordersUser() {
        return dordersUser;
    }

    public void setDordersUser(String dordersUser) {
        this.dordersUser = dordersUser == null ? null : dordersUser.trim();
    }

    public String getPayableUser() {
        return payableUser;
    }

    public void setPayableUser(String payableUser) {
        this.payableUser = payableUser == null ? null : payableUser.trim();
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public BigDecimal getLogisticspriceTprice() {
        return logisticspriceTprice;
    }

    public void setLogisticspriceTprice(BigDecimal logisticspriceTprice) {
        this.logisticspriceTprice = logisticspriceTprice;
    }
}