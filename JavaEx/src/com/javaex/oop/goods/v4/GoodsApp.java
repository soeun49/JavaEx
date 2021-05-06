package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		//생성자를 이용한 객체의 초기화
		Goods notebook = new Goods ("LG Gram", 1500000);
		
		//Goods notebook = new Goods(); //  생성자 선언 시, error 발생 --> 임의로 생성자 추가해서 
		
		//setter를 이용한 우회설정 
//		notebook.name= "LG Gram"; //private 으로 바뀌면서 접근 불가 ->  error가 됨 
//		notebook.price = 1500000;
	
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone =new Goods ("iPhone", 1000000);
		//Goods smartphone = new Goods ();
		//	smartphone.setName ("iPhone");
	//	smartphone.setPrice (1000000);
		
		
		System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(),smartphone.getPrice());
		
		//price, name  필드는 읽기 전용 필드 데이터를 변경할 수 있음 
		//notebook.setPrice(15000);
		//smartphone.setPrice(10000);
		
		//내장 매서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
