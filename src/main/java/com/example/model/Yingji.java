package com.example.model;

public class Yingji {
    private String yingjiName;

    private String yingjiPhone;

    private Integer yingjiJialing;

    public String getYingjiName() {
        return yingjiName;
    }

    public void setYingjiName(String yingjiName) {
        this.yingjiName = yingjiName == null ? null : yingjiName.trim();
    }

    public String getYingjiPhone() {
        return yingjiPhone;
    }

    public void setYingjiPhone(String yingjiPhone) {
        this.yingjiPhone = yingjiPhone == null ? null : yingjiPhone.trim();
    }

    public Integer getYingjiJialing() {
        return yingjiJialing;
    }

    public void setYingjiJialing(Integer yingjiJialing) {
        this.yingjiJialing = yingjiJialing;
    }
}