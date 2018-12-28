package com.example.model;

public class Bill {
    private Integer billId;

    private String financeNo;

    private String billName;

    private Integer billMode;

    private String billPrice;

    private Integer billWhether;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getFinanceNo() {
        return financeNo;
    }

    public void setFinanceNo(String financeNo) {
        this.financeNo = financeNo == null ? null : financeNo.trim();
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName == null ? null : billName.trim();
    }

    public Integer getBillMode() {
        return billMode;
    }

    public void setBillMode(Integer billMode) {
        this.billMode = billMode;
    }

    public String getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(String billPrice) {
        this.billPrice = billPrice == null ? null : billPrice.trim();
    }

    public Integer getBillWhether() {
        return billWhether;
    }

    public void setBillWhether(Integer billWhether) {
        this.billWhether = billWhether;
    }
}