package com.mai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lucas_mai
 * @Date 2021/4/20 ^_^
 */

/**
 * 测试spring-mvc框架是否正常使用
 */
@Controller
public class TestController {

    @RequestMapping("/layui_demo")
    public String layui(){
        return "layui_demo";
    }
}
