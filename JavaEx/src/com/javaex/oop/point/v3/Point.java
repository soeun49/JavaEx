package com.javaex.oop.point.v3;

//v3. 매서드 오버로딩 

public class Point {
	//필드 은닉
	private int x; 
	private int y;
	
	
	//생성자
	public Point (int x, int y ) {
		this.x= x;
		this.y=y;
		
	}
	//getter&setter
	public int getX() {
		return x;
		
		}
	
	public void setX (int x) {
		this.x = x;
		
	}
	
	public int getY() {
		return y;
		
	}
	
	public void setY (int y) {
		this.y = y;
		
	}
	
	// 매서드
	
	public void draw() {
		System.out.printf("점 (x=%d,y=%d)를 그렸습니다%n",x,y);
	}
	
	//매서드 오버로딩 
	//다형성의 일부; 다른 매서드와 같은 이름이지만 매개변수의 타입, 갯수, 순서만 다른 매서드를 생성
	public void draw(boolean show) {
	String message= String.format("점 (x=%d. y=%d)을 " , x,y);
		if (show) {
			message += "그렸습니다.";
		}
			else {
				message += "지웠습니다.";
						
			}
		System.out.println(message);
		}
		
		
	}



