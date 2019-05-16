package com.twy.demo3;

public class SingletonDemoTest {
	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

	}
}
