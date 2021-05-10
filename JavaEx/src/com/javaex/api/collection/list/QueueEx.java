package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//입력 방향과 출력 방향이 반대
	//FIFO 형식 -> First in, First Out
	public static void main(String[] args) {
		//실체 클래스 x
		//인터페이스만 존재함 
		Queue<Integer> queue = new LinkedList<>();
		
		//데이터의 제공
		for (int i=1; i<=10; i++) {
			queue.offer(i);
			System.out.println("OFFER: " + queue);
		}
		System.out.println("PEEK: "+ queue.peek()); //peek는 조회만, 삭제 x
		System.out.println("QUEUE: " + queue);
		
		while(!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
	}
	

}
