package com.example.mapper;

import com.example.model.Orderl;

public interface OrderlMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(Orderl record);

    int insertSelective(Orderl record);

    Orderl selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(Orderl record);

    int updateByPrimaryKey(Orderl record);
}