package com.twy.demo7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	@Test
	public void demo4(){
		String xmlPath="com/twy/demo7/applicationContext.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlPath);
		Penson p=(Penson) applicationContext.getBean("personId");
		System.out.println(p);
	}
}
