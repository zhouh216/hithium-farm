package com.bugull.hithiumfarmweb.http.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class IncomeEntity {


    private String deviceName;

    private BigDecimal income;

    private String incomeOfDay;

    private String province;

    private String city;
}
