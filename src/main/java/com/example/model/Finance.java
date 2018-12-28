package com.example.model;

import java.util.Date;

public class Finance {
    private String financeNo;

    private Integer financeAuditing;

    private Date financeCreatedate;

    private Date financePaytime;

    public String getFinanceNo() {
        return financeNo;
    }

    public void setFinanceNo(String financeNo) {
        this.financeNo = financeNo == null ? null : financeNo.trim();
    }

    public Integer getFinanceAuditing() {
        return financeAuditing;
    }

    public void setFinanceAuditing(Integer financeAuditing) {
        this.financeAuditing = financeAuditing;
    }

    public Date getFinanceCreatedate() {
        return financeCreatedate;
    }

    public void setFinanceCreatedate(Date financeCreatedate) {
        this.financeCreatedate = financeCreatedate;
    }

    public Date getFinancePaytime() {
        return financePaytime;
    }

    public void setFinancePaytime(Date financePaytime) {
        this.financePaytime = financePaytime;
    }
}