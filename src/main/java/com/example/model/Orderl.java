package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orderl {
    private String orderNo;

    private String dorderNo;

    private Integer orderState;

    private Date oorderCreatedate;

    private Date orderPaytime;

    private Date orderDeliverytime;

    private String orderNotes;

    private String rejectReason;

    private BigDecimal logisticspriceTprice;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getDorderNo() {
        return dorderNo;
    }

    public void setDorderNo(String dorderNo) {
        this.dorderNo = dorderNo == null ? null : dorderNo.trim();
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOorderCreatedate() {
        return oorderCreatedate;
    }

    public void setOorderCreatedate(Date oorderCreatedate) {
        this.oorderCreatedate = oorderCreatedate;
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public Date getOrderDeliverytime() {
        return orderDeliverytime;
    }

    public void setOrderDeliverytime(Date orderDeliverytime) {
        this.orderDeliverytime = orderDeliverytime;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes == null ? null : orderNotes.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public BigDecimal getLogisticspriceTprice() {
        return logisticspriceTprice;
    }

    public void setLogisticspriceTprice(BigDecimal logisticspriceTprice) {
        this.logisticspriceTprice = logisticspriceTprice;
    }
}