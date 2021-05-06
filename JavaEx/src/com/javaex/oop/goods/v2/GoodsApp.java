package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//setter를 이용한 우회설정 
//		notebook.name= "LG Gram"; //private 으로 바뀌면서 접근 불가 ->  error가 됨 
//		notebook.price = 1500000;
	
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone = new Goods ();
		smartphone.setName ("iPhone");
		smartphone.setPrice (1000000);
		
		
		System.out.printf("%s, %d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(),smartphone.getPrice());
		
		
		//내장 매서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
