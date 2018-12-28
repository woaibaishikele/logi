package com.example.model;

public class Store {
    private Integer storeId;

    private String storeName;

    private String storeQuarter;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreQuarter() {
        return storeQuarter;
    }

    public void setStoreQuarter(String storeQuarter) {
        this.storeQuarter = storeQuarter == null ? null : storeQuarter.trim();
    }
}