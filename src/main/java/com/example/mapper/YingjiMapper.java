package com.example.mapper;

import com.example.model.Yingji;

public interface YingjiMapper {
    int deleteByPrimaryKey(String yingjiName);

    int insert(Yingji record);

    int insertSelective(Yingji record);

    Yingji selectByPrimaryKey(String yingjiName);

    int updateByPrimaryKeySelective(Yingji record);

    int updateByPrimaryKey(Yingji record);
}