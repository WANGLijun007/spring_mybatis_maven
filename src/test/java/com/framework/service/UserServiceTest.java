package com.framework.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;

import com.framework.baseTest.SpringTestCase;
import com.framework.domain.User;
import com.framework.service.UserService;  


public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}
