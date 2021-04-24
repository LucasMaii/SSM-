package com.mai.controller;

import com.mai.resultHandler.DataResult;
import com.mai.service.UserService;
import com.mai.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @Author Lucas_mai
 * @Date 2021/4/21 ^_^
 * 处理系统主页登陆注册跳转等功能
 */

@Controller
@SessionAttributes(value = {"isLogin","myInfo"})
public class IndexController {

    @Autowired
    public UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 主页地址 http://localhost:8080/
     * @return
     */
    @RequestMapping("/")
    public String main(){
        return "redirect:index";
    }

    /**
     * 进行登陆验证
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public DataResult login(@RequestParam("id")String loginName,
                            @RequestParam("password")String password, Model model, HttpSession httpSession){
        System.out.println("用户输入用户名和密码："+loginName+" "+password);

        DataResult dataResult = userService.login(loginName,password);
        System.out.println(dataResult);
        //登录成功了，设置Session的值
        if(dataResult.getStatus() == 0){
            model.addAttribute("isLogin",true);
            model.addAttribute("myInfo",dataResult.getData());
        }
        return dataResult;
    }

    /**
     * 电子相册主页面
     * @param model
     * @return
     */
    @RequestMapping("/home")
    public ModelAndView goToHome(Model model){

        return new ModelAndView("layui_demo");
    }

    /**
     * 退出登录，将session中保存的登录信息设置为空
     * @param model
     * @param httpSession
     */
    @RequestMapping("/logout")
    @ResponseBody
    public void logout(Model model,HttpSession httpSession){

        httpSession.invalidate();
        model.addAttribute("isLogin",false);
        model.addAttribute("myInfo",null);
    }

    /**
     * 接受前端传来的注册信息进行处理
     * @param id
     * @param password
     * @param name
     * @return
     */
    @RequestMapping(value="/registerJ",method = RequestMethod.POST)
    @ResponseBody
    public DataResult registerJ(@RequestParam("id")String id,
                                @RequestParam("password")String password,
                                @RequestParam("name")String name){
        System.out.println("注册信息1："+id+password+name);
        return userService.register(id,password,name);
    }
}
