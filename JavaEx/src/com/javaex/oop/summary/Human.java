package com.javaex.oop.summary;

public class Human extends Animal {

	//생성자
	public Human (String name, int age) {
		super (name,age);
		
	}
	//추상메서드 OVERRIDE 
	@Override
	public void say() {
		System.out.printf("안녕, 나는 %s%n.", name);
		
	}
	
	
}
