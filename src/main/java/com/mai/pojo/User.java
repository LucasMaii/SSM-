package com.mai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author Lucas_mai
 * @Date 2021/4/21 ^_^
 * User类 映射 USERS表: 用于储存用户个人信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private String password;
    private String name;
    private String userState;
    private String type;
    private String descp;
    private String createTime;
}
