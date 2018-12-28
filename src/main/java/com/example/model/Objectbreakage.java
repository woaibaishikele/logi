package com.example.model;

import java.util.Date;

public class Objectbreakage {
    private Integer objectbreakageId;

    private String orderId;

    private Date orderCreatedate;

    private Date orderPaytime;

    private byte[] orderUser;

    public Integer getObjectbreakageId() {
        return objectbreakageId;
    }

    public void setObjectbreakageId(Integer objectbreakageId) {
        this.objectbreakageId = objectbreakageId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getOrderCreatedate() {
        return orderCreatedate;
    }

    public void setOrderCreatedate(Date orderCreatedate) {
        this.orderCreatedate = orderCreatedate;
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public byte[] getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(byte[] orderUser) {
        this.orderUser = orderUser;
    }
}