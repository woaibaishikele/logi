package com.example.mapper;

import com.example.model.Warehouses;

public interface WarehousesMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(Warehouses record);

    int insertSelective(Warehouses record);

    Warehouses selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(Warehouses record);

    int updateByPrimaryKey(Warehouses record);
}