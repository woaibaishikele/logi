package com.example.mapper;

import com.example.model.Breakageaudit;

public interface BreakageauditMapper {
    int deleteByPrimaryKey(Integer breakageauditId);

    int insert(Breakageaudit record);

    int insertSelective(Breakageaudit record);

    Breakageaudit selectByPrimaryKey(Integer breakageauditId);

    int updateByPrimaryKeySelective(Breakageaudit record);

    int updateByPrimaryKey(Breakageaudit record);
}