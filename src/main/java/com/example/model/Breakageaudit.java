package com.example.model;

import java.util.Date;

public class Breakageaudit {
    private Integer breakageauditId;

    private String objectbreakageId;

    private String breakageauditSituation;

    private Date breakageauditCreatedate;

    private Date breakageauditPaytime;

    public Integer getBreakageauditId() {
        return breakageauditId;
    }

    public void setBreakageauditId(Integer breakageauditId) {
        this.breakageauditId = breakageauditId;
    }

    public String getObjectbreakageId() {
        return objectbreakageId;
    }

    public void setObjectbreakageId(String objectbreakageId) {
        this.objectbreakageId = objectbreakageId == null ? null : objectbreakageId.trim();
    }

    public String getBreakageauditSituation() {
        return breakageauditSituation;
    }

    public void setBreakageauditSituation(String breakageauditSituation) {
        this.breakageauditSituation = breakageauditSituation == null ? null : breakageauditSituation.trim();
    }

    public Date getBreakageauditCreatedate() {
        return breakageauditCreatedate;
    }

    public void setBreakageauditCreatedate(Date breakageauditCreatedate) {
        this.breakageauditCreatedate = breakageauditCreatedate;
    }

    public Date getBreakageauditPaytime() {
        return breakageauditPaytime;
    }

    public void setBreakageauditPaytime(Date breakageauditPaytime) {
        this.breakageauditPaytime = breakageauditPaytime;
    }
}