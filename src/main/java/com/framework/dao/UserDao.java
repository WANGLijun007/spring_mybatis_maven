/** 
 * Project Name:first_maven_project 
 * File Name:UserDao.java 
 * Package Name:com.framework.dao 
 * Date:2017年4月9日下午6:46:28 
 * 
*/  
package com.framework.dao;  
import org.springframework.stereotype.Repository;

import com.framework.domain.User;
/** 
 * ClassName:UserDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年4月9日 下午6:46:28 <br/> 
 *      
 */

public interface UserDao {

	 /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);
    
   /*用branchA更新master */
	
}
 
	