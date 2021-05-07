package com.javaex.api.objectclass.v2;

//v2
//두 객체의 값의 비교는 -> equals 메서드 정의

public class Point {

	private int x;
	private int y;

	public Point (int x, int y) {
			this.x=x;
			this.y=y;
			
	}
	//객체의 정보를 문자열로 반환
	//print 계열의 매서드로 출력할떄
	//문자열과 객체를 연결할 떄 호출 
	@Override
	public String toString() {
		
		return String.format("Point (%d,%d)",x,y);
	}
	@Override
	public boolean equals(Object obj) {
		//equals의 리턴값은 boolean
		//넘어온 객체가 Point인지 확인
		if (obj instanceof Point) { 
			//캐스팅
			Point other = (Point)obj;
			return x== other.x && y==other.y;
			
					
		}
		
		return super.equals(obj);
	}
		
	
}
