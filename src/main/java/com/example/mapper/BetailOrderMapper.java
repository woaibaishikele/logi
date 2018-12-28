package com.example.mapper;

import com.example.model.BetailOrder;

public interface BetailOrderMapper {
    int deleteByPrimaryKey(String dordersNo);

    int insert(BetailOrder record);

    int insertSelective(BetailOrder record);

    BetailOrder selectByPrimaryKey(String dordersNo);

    int updateByPrimaryKeySelective(BetailOrder record);

    int updateByPrimaryKey(BetailOrder record);
}