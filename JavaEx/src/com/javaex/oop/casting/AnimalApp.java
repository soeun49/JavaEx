package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
	// 자바는 자식타입의 객체를 부모타입 클래스로 참조할 수 있음
		Dog dog1 = new Dog ("Snoopy");
		
		dog1.eat();
		dog1.walk();
		dog1.bark();
		//참조 타입 설계도에 있는 기능만 수행가능!
		
		//자식 개체를 부모 타입으로 참조하는 것 -> Upcasting 
		Animal dog2= new Dog ("Doogy");
		
		dog2.eat();
		dog2.walk();
		//dog2.bark(); //Animal 설계도에 없는 기능이기 때문에 실행 불가능!
		
		//원래대로 돌려놓기 ->  Downcasting
		((Dog)dog2).bark();
		
		Animal pet= new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet= new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		//by Downcasting, 실제 객체를 확인해야 할 필요가 있음
		//instanceof (!) 
		if (pet instanceof Dog) { //pet의 Dog클래스의 인스턴스?
					
		((Dog)pet).bark(); //Dog은 bark가 되지만 실제 객체인 Cat은 안됨 -> ERROR
		
		
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
		
	}

}
