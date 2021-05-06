package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name= "LG Gram"; //private 으로 바뀌면서 접근 불가 ->  error가 됨 
		notebook.price = 1500000;
		
		Goods smartphone = new Goods ();
		smartphone.name = "iPhone";
		smartphone.price = 1000000;
		
		
		System.out.printf("%s, %d원%n", notebook.name, notebook.price);
		System.out.printf("%s, %d원%n", smartphone.name,smartphone.price);
		
	}

}
