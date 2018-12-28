package com.example.mapper;

import com.example.model.Travels;

public interface TravelsMapper {
    int deleteByPrimaryKey(Integer travelsId);

    int insert(Travels record);

    int insertSelective(Travels record);

    Travels selectByPrimaryKey(Integer travelsId);

    int updateByPrimaryKeySelective(Travels record);

    int updateByPrimaryKey(Travels record);
}