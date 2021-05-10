package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		//선언
		//List<참조타입> = LinkedList (실체클래스) 
		//-> 실체클래스 별 구현 방법이 다름 d.h. 실체클래스 변경만으로 구현 방식을 바꿀 수 있음 
		//List<String> lst = new LinkedList<> (); ->  LinkedList
		List<String> lst = new ArrayList<>(); //다형성 -> ArrayList
		
		//객체 추가
		lst.add("Java"); //add -> 맨 뒤에 새 노드 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println(lst);
		
		//객체 삽입 (중간에 객체 삽입)
		//원칙상, LinkedList는 인덱스 x
		lst.add(2,"C#"); //2번 위치에 C#추가
		lst.add("Java"); // list는 중복 허용!
		System.out.println(lst);
		
		//요소의 갯수 확인
		System.out.println("요소의 갯수: " + lst.size());//capacity 확인 x
		
		//요소의 삭제
		lst.remove(2); //인덱스를 이용한 삭제 
		System.out.println(lst);
		
		//객체의 삭제
		lst.remove("Python");
		System.out.println(lst);
		
		
		//Todo: 루프!
		
		//비우기
		lst.clear();
		System.out.println(lst);
		
	}

}
