package com.example.mapper;

import com.example.model.State;

public interface StateMapper {
    int deleteByPrimaryKey(Integer orderState);

    int insert(State record);

    int insertSelective(State record);

    State selectByPrimaryKey(Integer orderState);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}