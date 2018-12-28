package com.example.mapper;

import com.example.model.Objectbreakages;

public interface ObjectbreakagesMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Objectbreakages record);

    int insertSelective(Objectbreakages record);

    Objectbreakages selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Objectbreakages record);

    int updateByPrimaryKey(Objectbreakages record);
}