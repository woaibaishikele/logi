package com.example.model;

public class State {
    private Integer orderState;

    private String orderStateName;

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderStateName() {
        return orderStateName;
    }

    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName == null ? null : orderStateName.trim();
    }
}