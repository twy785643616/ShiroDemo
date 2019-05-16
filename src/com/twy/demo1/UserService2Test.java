package com.twy.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserService2Test {
	@Test
	public void test(){
		String xmlPath="com/twy/demo1/applicationContext.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		UserService2 userService2=(UserService2) applicationContext.getBean("userService");
		userService2.updateUser();
	}

}
