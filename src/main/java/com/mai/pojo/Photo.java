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
public class Photo {

    private String id = "";
    private String name = "";
    private String createTime = "";
    private String url = "";
    private int praiseCount = 0;
}
