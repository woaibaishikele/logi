package com.example.mapper;

import com.example.model.Logisticsprice;
import java.math.BigDecimal;

public interface LogisticspriceMapper {
    int deleteByPrimaryKey(BigDecimal logisticspricePrice);

    int insert(Logisticsprice record);

    int insertSelective(Logisticsprice record);

    Logisticsprice selectByPrimaryKey(BigDecimal logisticspricePrice);

    int updateByPrimaryKeySelective(Logisticsprice record);

    int updateByPrimaryKey(Logisticsprice record);
}