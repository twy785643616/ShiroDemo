package com.twy.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {
	@Test
	public void test(){
		String xmlPath="com/twy/demo/applicationContext.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=(UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}

}
