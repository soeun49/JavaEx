package com.javaex.oop.summary;

//인터페이스는 여러개 구현이 가능함 

public class TheOne extends Human implements KungfuSkill, Flyable {

	public TheOne (String name, int Age) {
		super(name, Age);
	}
	
	@Override
	public void fly() {
		System.out.printf("%s: I believe I can fly!%n", name);
	}

	@Override
	public void kungfu() {
		System.out.printf("%s: I know Kungfu!%n", name);
		
	}

}
