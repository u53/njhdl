package com.zb.njhld.entity;

import lombok.Data;


@Data
public class Merchants {

    /**
     * 商家ID
     */
    private int merchantsId;
    /**
     * 商家登录账户
     */
    private String merchantsName;
    /**
     * 商家登录密码
     */
    private String merchantsPassword;



}
