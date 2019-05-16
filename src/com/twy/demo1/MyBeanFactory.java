package com.twy.demo1;

public class MyBeanFactory {
	public static UserService2 createUser(){
		return new UserService2Imp1();
		
	}
}
