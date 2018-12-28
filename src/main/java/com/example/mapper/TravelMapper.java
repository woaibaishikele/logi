package com.example.mapper;

import com.example.model.Travel;

public interface TravelMapper {
    int deleteByPrimaryKey(String travelsNo);

    int insert(Travel record);

    int insertSelective(Travel record);

    Travel selectByPrimaryKey(String travelsNo);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);
}