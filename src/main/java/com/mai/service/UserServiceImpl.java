package com.mai.service;

import com.mai.dao.UserMapper;
import com.mai.pojo.User;
import com.mai.resultHandler.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Lucas_mai
 * @Date 2021/4/21 ^_^
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 判断用户是否被注册过
     * @param id
     * @return
     */
    @Override
    public boolean isUserIdExist(String id) {

        return userMapper.isUserIdExist(id);
    }

    /**
     * 接受前端传过来的用户名和密码，进行登录验证
     * @param loginName
     * @param password
     * @return
     */
    @Override
    public DataResult login(String loginName, String password) {

        DataResult dataResult;

        if(isUserIdExist(loginName)){
            User user = userMapper.getUserInfoById(loginName);
            if(user.getPassword().equals(password)){
                dataResult = DataResult.success("信息：登陆成功",user);
            }else{
                dataResult = DataResult.fail("信息：用户名密码不匹配");
            }
        }else{
            dataResult = DataResult.fail("信息：用户名不存在");
        }




        return dataResult;
    }

    /**
     * 接受前端的注册信息，对数据库进行访问查询，并进行注册操作
     * @param id
     * @param password
     * @param name
     * @return
     */
    public DataResult register(String id, String password, String name) {

        System.out.println("注册信息："+id+password+name);
        DataResult dataResult = new DataResult();
        dataResult.setStatus(0);
        User user = new User();
        user.setName("name");
        dataResult.setData(user);

        return dataResult;
    }



}
