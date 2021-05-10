package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 -> 내부 데이터 타입 결정
		
		Box<Integer> intBox= new Box<>(); //객체화 할 때, 내부 데이터 타입 결정 
		intBox.setContent(2021); // 
//		intBox.setContent("Java"); //컴파일 타임에 내부데이터를 체크해 줄 수 있음. -> 안정성 확보
		
		
		// 내용물을 꺼내보자
		int retVal =  intBox.getContent();  // 타입 캐스팅의 번거로움 제거!
		System.out.println("내용물: " + retVal);
		
		//Box 생성 String 값을 설정
		Box<String> strBox= new Box<>();
		strBox.setContent("Java");
		
		String strVal= strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		//만약에 캐스팅 잘못 했다면
		//컴파일러가 내부 데이터 타입을 확인해서 실행 이전에 미리 체크 할 수 있음
		
		//Generic을 사용하면
		//1. 캐스팅을 해야하는 불편함을 해소
		//2. 캐스팅 오류의 위험성을 컴파일 타임에서 체크할 수 있음 
	}

}
