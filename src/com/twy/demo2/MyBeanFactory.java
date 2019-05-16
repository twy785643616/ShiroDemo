package com.twy.demo2;

public class MyBeanFactory {
	public UserService createUser(){
		return new UserServiceImp1();
		
	}
}
