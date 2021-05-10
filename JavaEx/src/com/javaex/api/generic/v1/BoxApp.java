package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 int 값을 설정
		
		Box intBox= new Box();
		intBox.setContent(2021); // = intBox.setcontent(Integer.valueOf(2021));
		
		// 내용물을 꺼내보자
		int retVal = (int)intBox.getContent(); //오류 발생 -> integer로 downcasting 해야 함 
		System.out.println("내용물: " + retVal);
		
		//Box 생성 String 값을 설정
		Box strBox= new Box();
		strBox.setContent("Java");
		
		String strVal=(String)strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		//만약에 캐스팅을 잘못 했다면.. 
		//strVal = (String)intBox.getContent();
		//변환 불가
		
		//1. Object를 다룰 수 있는 클래스를 생성하면 캐스팅을 해야 하는 불편함
		//2. 캐스팅 오류를 컴파일 타임에서 체크 불가능함 
	}

}
