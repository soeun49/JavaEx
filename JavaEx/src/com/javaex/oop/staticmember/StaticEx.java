package com.javaex.oop.staticmember;

public class StaticEx {
		public static int refCount; // 클래스 멤버- 참조 카운트
		public static String classVar;// 클래스 멤버
		public String instanceVar; //인스턴스 멤버
		
		// 인스턴스 영역 -> 클래스 영역 접근 가능 
		// 클래스 영역 -> 인스턴스 영역 접근 불가능 

		//클래스 영역 초기화: static block 사용
		static {
			refCount = 0;
			classVar = "Static Member";
			//instanceVar = "Instance Member"; // static에서 instance 접근 불가 d.h ERROR
			System.out.println("Static Block");			
		}		
		
		//생성자: 인스턴스 초기화
		public StaticEx() {
			refCount ++; //참조 카운트 증가
			System.out.println("refCount:" + refCount);
			System.out.println("새 인스턴스가 생성!");
			
		}
		
		//소멸자: 객체가 해제될 때 호출 finalize + ctrl +space 
		//소멸자가 실행되도 즉시 사라지는 것은 아님 b/c garbage collector가 참조되지 않는 것을 확인하면 소멸함 
	@Override
	protected void finalize() throws Throwable {
	// 참조 카운트 줄이기
		refCount--;
	super.finalize();
	System.out.println("소멸자 호출");
	}
		
	}


