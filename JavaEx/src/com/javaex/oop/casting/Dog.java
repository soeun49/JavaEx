package com.javaex.oop.casting;

public class Dog extends Animal //생성자 생성 필수!
{
public Dog (String name) {
	super(name);
	
}
public void bark() {
	System.out.println(name + ": 멍멍!");
	
	}
}
