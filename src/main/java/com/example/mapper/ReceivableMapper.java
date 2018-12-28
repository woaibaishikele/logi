package com.example.mapper;

import com.example.model.Receivable;

public interface ReceivableMapper {
    int deleteByPrimaryKey(Integer billId);

    int insert(Receivable record);

    int insertSelective(Receivable record);

    Receivable selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(Receivable record);

    int updateByPrimaryKey(Receivable record);
}