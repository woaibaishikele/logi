package com.example.mapper;

import com.example.model.Finance;

public interface FinanceMapper {
    int deleteByPrimaryKey(String financeNo);

    int insert(Finance record);

    int insertSelective(Finance record);

    Finance selectByPrimaryKey(String financeNo);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}