package com.example.model;

public class Warehouse {
    private Integer warehouseId;

    private String warehousesCargonumber;

    private Integer warehouseOutofthetreasury;

    private Integer warehouseWarehousing;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehousesCargonumber() {
        return warehousesCargonumber;
    }

    public void setWarehousesCargonumber(String warehousesCargonumber) {
        this.warehousesCargonumber = warehousesCargonumber == null ? null : warehousesCargonumber.trim();
    }

    public Integer getWarehouseOutofthetreasury() {
        return warehouseOutofthetreasury;
    }

    public void setWarehouseOutofthetreasury(Integer warehouseOutofthetreasury) {
        this.warehouseOutofthetreasury = warehouseOutofthetreasury;
    }

    public Integer getWarehouseWarehousing() {
        return warehouseWarehousing;
    }

    public void setWarehouseWarehousing(Integer warehouseWarehousing) {
        this.warehouseWarehousing = warehouseWarehousing;
    }
}