/** 
 * Project Name:first_maven_project 
 * File Name:UserService.java 
 * Package Name:com.framework.service 
 * Date:2017年4月9日下午6:48:25 
 * 
*/

package com.framework.service;

import com.framework.domain.User;

/**
 * ClassName:UserService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年4月9日 下午6:48:25 <br/>
 * 
 */
public interface UserService {
	User selectUserById(Integer userId);
}
