package com.mai.service;

import com.mai.resultHandler.DataResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * 判断用户名（邮箱）是否已经存在，或被注册过
     * @param id
     * @return
     */
    boolean isUserIdExist(@Param("id") String id);

    /**
     * 接受前端传过来的用户名和密码，进行登录验证
     * @param loginName
     * @param password
     * @return
     */
    DataResult login(String loginName, String password);

    /**
     * 接受前端的注册信息，对数据库进行访问查询，并进行注册操作
     * @param id
     * @param password
     * @param name
     * @return
     */
     DataResult register(String id, String password, String name);
}
