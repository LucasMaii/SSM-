package com.mai.dao;

import com.mai.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author Lucas_mai
 * @Date 2021/4/21 ^_^
 */
@Repository
public interface UserMapper {

    /**
     * 判断用户名（邮箱）是否已经存在，或被注册过
     * @param id
     * @return
     */
    boolean isUserIdExist(@Param("id") String id);

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
     User getUserInfoById(@Param("id") String id);
}
