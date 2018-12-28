package com.example.mapper;

import com.example.model.Payable;

public interface PayableMapper {
    int deleteByPrimaryKey(String payableUser);

    int insert(Payable record);

    int insertSelective(Payable record);

    Payable selectByPrimaryKey(String payableUser);

    int updateByPrimaryKeySelective(Payable record);

    int updateByPrimaryKey(Payable record);
}