package com.javaex.api.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle (6,4); //24
		Rectangle b = new Rectangle (12,2); //24
		Rectangle c = new Rectangle (6,6);
		
		System.out.println("a.equals(b):" + a.equals(b));
		System.out.println("a.equals(c):" + a.equals(c));
		
		

	}

}
