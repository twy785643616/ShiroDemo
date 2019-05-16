package com.twy.demo3;

public class SingletonDemo {
	private static SingletonDemo singletonDemo;
	static{
		singletonDemo=new SingletonDemo();
	}
	private SingletonDemo(){}
	public static SingletonDemo getInstance() {
		return singletonDemo;
	}

}
