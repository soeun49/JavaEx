package com.javaex.oop.goods.v3;

// v3. 생성자: Constructor: 객체를 인스턴스화 할 때, 초기화를 담당 
// 리턴파일은 없으며, 클래스 명과 이름이 같아야 함 
public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	//1. 사용자가 정의한 생성자가 하나도 없을 경우, 컴파일러가 기본 생성자를 추가함 
	//2. 사용자가 생성자를 선언할 경우, 컴파일러는 기본 생성자를 추가하지 않음 
	
	public Goods(String name, int price) {
		//객체 생성시, 초기화 코드
		this.name = name;
		this.price = price;
		
	}
	
	//Getter
	//setter 가 없을 경우, 읽기 전용이 된다 
	
	public String getName( ) {
		return name;
	
	}
//	public void setName(String name) {
	//	this.name = name; //this. ->  인스턴스
//	}
			public int getPrice() {
				return price;
			}

			//public void setPrice(int price) {
				//this.price = price;
		//}
	
	//매서드 
	public void showInfo() {
		System.out.println("상품명:" +  name);
		System.out.println("가격:" + price); 
		
	}
	
	
}
