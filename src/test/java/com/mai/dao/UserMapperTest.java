package com.mai.dao;

import com.mai.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void testUserExist(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        System.out.println(userServiceImpl);
        System.out.println(userServiceImpl.isUserIdExist("lucasmai"));
    }

}