/** 
 * Project Name:first_maven_project 
 * File Name:UserServiceTest.java 
 * Package Name:com.framework.service 
 * Date:2017年4月9日下午7:02:57 
 * 
*/  
  
package com.framework.baseTest;
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

/** 
 * ClassName:UserServiceTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2017年4月9日 下午7:02:57 <br/> 
 *      
 */


//指定bean注入的配置文件  
@ContextConfiguration(locations = { "classpath:application.xml" })  
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)  
public class SpringTestCase extends AbstractJUnit4SpringContextTests {

}