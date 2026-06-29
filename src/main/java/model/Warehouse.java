package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Warehouse {

    private Integer whid;

    private String name;

    private BigDecimal capacity;

    private Integer cityid;

    private String contact;

    private String comment;

}