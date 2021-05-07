package com.javaex.oop.shape.v1;

//d.h. 추상 클래스 상속시 부모 클래스의 추상 메서드 반드시 구현해주어야 함 
//추상 클래스 속 추상 메서드를 구현하지 않아서 ERROR!
public class Rectangle extends Shape {
	//필드
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle (int x, int y, int width, int height) {
		super (x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("사각형 (x=%d, y=%d, w=%d, h=%d, area=%.2f)을 그렸어요.%n", x,y,width,height,area());
	}

	@Override
	public double area() {
		return width * height;
		
		
	}

}
