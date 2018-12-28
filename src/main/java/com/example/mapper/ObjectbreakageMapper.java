package com.example.mapper;

import com.example.model.Objectbreakage;

public interface ObjectbreakageMapper {
    int deleteByPrimaryKey(Integer objectbreakageId);

    int insert(Objectbreakage record);

    int insertSelective(Objectbreakage record);

    Objectbreakage selectByPrimaryKey(Integer objectbreakageId);

    int updateByPrimaryKeySelective(Objectbreakage record);

    int updateByPrimaryKeyWithBLOBs(Objectbreakage record);

    int updateByPrimaryKey(Objectbreakage record);
}