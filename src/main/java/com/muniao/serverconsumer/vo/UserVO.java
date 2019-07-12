package com.muniao.serverconsumer.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO
{
    private String userName;
    private int age;
    private Date birthday;
}
