package com.example.model;

public class Warehouses {
    private String orderNo;

    private String warehousesCargonumber;

    private String warehousesType;

    private String warehousesTypes;

    private String warehousesName;

    private String warehousesSun;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getWarehousesCargonumber() {
        return warehousesCargonumber;
    }

    public void setWarehousesCargonumber(String warehousesCargonumber) {
        this.warehousesCargonumber = warehousesCargonumber == null ? null : warehousesCargonumber.trim();
    }

    public String getWarehousesType() {
        return warehousesType;
    }

    public void setWarehousesType(String warehousesType) {
        this.warehousesType = warehousesType == null ? null : warehousesType.trim();
    }

    public String getWarehousesTypes() {
        return warehousesTypes;
    }

    public void setWarehousesTypes(String warehousesTypes) {
        this.warehousesTypes = warehousesTypes == null ? null : warehousesTypes.trim();
    }

    public String getWarehousesName() {
        return warehousesName;
    }

    public void setWarehousesName(String warehousesName) {
        this.warehousesName = warehousesName == null ? null : warehousesName.trim();
    }

    public String getWarehousesSun() {
        return warehousesSun;
    }

    public void setWarehousesSun(String warehousesSun) {
        this.warehousesSun = warehousesSun == null ? null : warehousesSun.trim();
    }
}