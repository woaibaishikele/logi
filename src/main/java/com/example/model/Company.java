package com.example.model;

public class Company {
    private String companyMonth;

    private String companyQuarter;

    private String companyYear;

    public String getCompanyMonth() {
        return companyMonth;
    }

    public void setCompanyMonth(String companyMonth) {
        this.companyMonth = companyMonth == null ? null : companyMonth.trim();
    }

    public String getCompanyQuarter() {
        return companyQuarter;
    }

    public void setCompanyQuarter(String companyQuarter) {
        this.companyQuarter = companyQuarter == null ? null : companyQuarter.trim();
    }

    public String getCompanyYear() {
        return companyYear;
    }

    public void setCompanyYear(String companyYear) {
        this.companyYear = companyYear == null ? null : companyYear.trim();
    }
}