package com.example.model;

public class Travels {
    private Integer travelsId;

    private String travelsNo;

    public Integer getTravelsId() {
        return travelsId;
    }

    public void setTravelsId(Integer travelsId) {
        this.travelsId = travelsId;
    }

    public String getTravelsNo() {
        return travelsNo;
    }

    public void setTravelsNo(String travelsNo) {
        this.travelsNo = travelsNo == null ? null : travelsNo.trim();
    }
}