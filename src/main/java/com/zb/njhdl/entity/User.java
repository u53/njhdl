package com.zb.njhdl.entity;

import lombok.Data;

@Data
public class User {

    /**
     * 用户ID
     */
    private int userId;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户注册手机号码
     */
    private String userPhone;

}
