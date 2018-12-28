package com.example.model;

import java.util.Date;

public class Payable {
    private String payableUser;

    private String payablePhone;

    private Integer billId;

    private Date payableCreatedate;

    private Date payablePaytime;

    public String getPayableUser() {
        return payableUser;
    }

    public void setPayableUser(String payableUser) {
        this.payableUser = payableUser == null ? null : payableUser.trim();
    }

    public String getPayablePhone() {
        return payablePhone;
    }

    public void setPayablePhone(String payablePhone) {
        this.payablePhone = payablePhone == null ? null : payablePhone.trim();
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Date getPayableCreatedate() {
        return payableCreatedate;
    }

    public void setPayableCreatedate(Date payableCreatedate) {
        this.payableCreatedate = payableCreatedate;
    }

    public Date getPayablePaytime() {
        return payablePaytime;
    }

    public void setPayablePaytime(Date payablePaytime) {
        this.payablePaytime = payablePaytime;
    }
}