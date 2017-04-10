/** 
 * Project Name:first_maven_project 
 * File Name:UserServiceImpl.java 
 * Package Name:com.framework.service 
 * Date:2017年4月9日下午6:48:49 
 * 
*/

package com.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.dao.UserDao;
import com.framework.domain.User;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年4月9日 下午6:48:49 <br/>
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}

}
