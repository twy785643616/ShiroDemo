package com.twy.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	@Test
	public void demo4(){
		String xmlPath="com/twy/demo4/applicationContext.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		User user=(User) applicationContext.getBean("userId");
		System.out.println(user);
	}
}
