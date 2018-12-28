package com.example.mapper;

import com.example.model.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(String companyMonth);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String companyMonth);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}