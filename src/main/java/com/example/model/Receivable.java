package com.example.model;

import java.util.Date;

public class Receivable {
    private Integer billId;

    private String receivableCompany;

    private Date receivableCreatedate;

    private Date receivablePaytime;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getReceivableCompany() {
        return receivableCompany;
    }

    public void setReceivableCompany(String receivableCompany) {
        this.receivableCompany = receivableCompany == null ? null : receivableCompany.trim();
    }

    public Date getReceivableCreatedate() {
        return receivableCreatedate;
    }

    public void setReceivableCreatedate(Date receivableCreatedate) {
        this.receivableCreatedate = receivableCreatedate;
    }

    public Date getReceivablePaytime() {
        return receivablePaytime;
    }

    public void setReceivablePaytime(Date receivablePaytime) {
        this.receivablePaytime = receivablePaytime;
    }
}