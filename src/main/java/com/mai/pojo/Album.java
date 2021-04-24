package com.mai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Lucas_mai
 * @Date 2021/4/24 ^_^
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {

    private String id = "";
    private String name = "";
    private String userId = "";
    private String createTime = "";
    private String coverId = "";
    private String descp = "";
    private String albumState = "";
    private int praiseCount = 0;
    private String category = "";
}
