package com.example.model;

public class Objectbreakages {
    private String orderId;

    private String objectbreakagesName;

    private String objectbreakagesSituation;

    private Integer objectbreakagesCompensate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getObjectbreakagesName() {
        return objectbreakagesName;
    }

    public void setObjectbreakagesName(String objectbreakagesName) {
        this.objectbreakagesName = objectbreakagesName == null ? null : objectbreakagesName.trim();
    }

    public String getObjectbreakagesSituation() {
        return objectbreakagesSituation;
    }

    public void setObjectbreakagesSituation(String objectbreakagesSituation) {
        this.objectbreakagesSituation = objectbreakagesSituation == null ? null : objectbreakagesSituation.trim();
    }

    public Integer getObjectbreakagesCompensate() {
        return objectbreakagesCompensate;
    }

    public void setObjectbreakagesCompensate(Integer objectbreakagesCompensate) {
        this.objectbreakagesCompensate = objectbreakagesCompensate;
    }
}