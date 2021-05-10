package com.javaex.api.collection.list;

import java.util.Stack;

//Stack 자료형: 입력과 출력이 한 쪽 방향에서만 이루어짐
//	중간에 삽입, 삭제는 불가 (LIFO 방식(!))

public class StackEx {

	public static void main(String[] args) {
		//Stack 선언
		Stack<Integer> stack= new Stack <>();
		
		//10개의 데이터를 입력
		for (int i=1; i<=10; i++) {
			//스택에 데이터 입력 : push
			stack.push(i);
			System.out.println("PUSH: " +stack);
		}
		//가장 위의 데이터 확인 : peek
		//only 데이터 확인 but 삭제x
			System.out.println("PEEK: " + stack.peek());
			System.out.println("Stack: " + stack);
			
		//데이터의 인증: pop -> 값을 삭제
		//peek 와 pop의 차이점 비교(!)
			System.out.println("POP: " + stack.pop());
			System.out.println("Stack: " + stack); 
		
		//주의: 비어있는 stack에서 pop -> ERROR!
		while(!stack.empty()) { //stack이 비어있지 않으면 실행 
			System.out.println("POP: " + stack.pop());
			System.out.println("Stack: " + stack);
			//stack이 다 비워지면 ERROR-> Stack UnderFlow (EmptyStackException) <-> Stack OverFlow
		}
	}

}
