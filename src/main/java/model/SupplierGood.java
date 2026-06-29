package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SupplierGood {

    private Integer suppid;

    private Integer goodsid;

    private BigDecimal purchasePrice;

}