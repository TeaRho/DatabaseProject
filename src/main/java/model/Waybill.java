package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Waybill {

    private Integer waybillid;

    //运输状态：待发运/运输中/已签收/已取消
    private String status;

    private BigDecimal totalFreight;

    private LocalDateTime createDate;

    //优先级：普通/加急/特急
    private String priority;

    private String clerk;

    private Integer destinationCityid;

    private String comment;

}