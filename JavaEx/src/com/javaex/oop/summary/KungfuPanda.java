package com.javaex.oop.summary;

//상속 (extends)은 오로지 1부모로부터
//구현 (implements)는 여러개의 인터베이스로부터 가능함 

public class KungfuPanda extends Panda implements KungfuSkill {

	/*1.생성자를 선언하지 않으면 -> 기본 생성자를 컴파일러가 추가 
	public KungfuPanda() {
		//2. 특별히 명시하지 않으면 -> 부모의 기본 생성자를 추가함 
	super (); //판다의 기본생성자도 없음..
	
	}*/
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~!%n", name);

	}

}
