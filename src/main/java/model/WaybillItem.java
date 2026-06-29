package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WaybillItem {

    private Integer itemid;

    private Integer waybillid;

    private Integer goodsid;

    private Integer whid;

    private Integer quantity;

    private BigDecimal baseFreight;

    private BigDecimal premiumRate;

    private BigDecimal tax;

}