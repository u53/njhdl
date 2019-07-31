package com.zb.njhdl.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Orders {

    /**
     * 订单ID
     */
    private int OrderId;
    /**
     * 订单编号
     */
    private String OrderCode;
    /**
     * 订单用户ID
     */
    private int userId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    /**
     * 订单生成时间
     */
    private Date OrderTime;
    /**
     * 订单状态
     */
    private String OrderState;
    /**
     * 消费状态
     */
    private int consumptionState;
    /**
     * 商品ID，数组形式
     */
    private String goodsId;
    /**
     * 订单总额
     */
    private Double TotalConsumption;

}
