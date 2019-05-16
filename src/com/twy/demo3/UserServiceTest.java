package com.twy.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {
	@Test
	public void test(){
		String xmlPath="com/twy/demo3/applicationContext.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=(UserService) applicationContext.getBean("userServiceId");
		UserService userService1=(UserService) applicationContext.getBean("userServiceId");
		System.out.println(userService);
		System.out.println(userService1);
	}

}
