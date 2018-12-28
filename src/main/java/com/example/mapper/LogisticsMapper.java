package com.example.mapper;

import com.example.model.Logistics;

public interface LogisticsMapper {
    int deleteByPrimaryKey(Integer logisticsId);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    Logistics selectByPrimaryKey(Integer logisticsId);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKeyWithBLOBs(Logistics record);

    int updateByPrimaryKey(Logistics record);
}