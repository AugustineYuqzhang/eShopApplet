package com.hypertech.applet.eshop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserInformation {
    private String userId;

    private String userName;

    private String number;

    private String email;

    private String sex;

    private String organization;

    private String department;

    private String position;

    private String role;

    private String status;

    private String note;

    private String avatarUrl;

    private Date createTime;

    private Date updateTime;

}
