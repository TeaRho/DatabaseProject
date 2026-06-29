package model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Inventory {

    private Integer inventoryid;

    private Integer whid;

    private Integer goodsid;

    private Integer quantity;

    private LocalDateTime lastUpdate;

}