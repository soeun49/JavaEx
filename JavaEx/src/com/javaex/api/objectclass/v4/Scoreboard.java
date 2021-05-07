package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//v4. 깊은 복제
// 얕은 복제: 필드의 값만 복사 -> 참조 타입 필드는 주소가 복사 
// 참조 타입 필드는 같은 객체를 참조하게 된다
// 깊은 복제: 내부에 있는 참조 필드도 복사해서 새로운 주소를 참조해야 한다. 
//Object 객체의 clone 매서드를 Override해야 함 


public class Scoreboard implements Cloneable {
	private int scores[]; //참조 타입 필드
	
	public Scoreboard(int [] scores) {
		this.scores= scores;
	}

	//깊은 복제를 위해 clone > override	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 먼저 얕은 복제를 시도해야 함 
		Scoreboard clone =(Scoreboard)super.clone();	
		//2. 내부의 참조 객체를 복사해서 새로 할당해줘야 함 
		clone.scores = Arrays.copyOf(scores, scores.length);
		
		return clone;
	}


	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone= (Scoreboard)clone(); //복제
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
	}
	
	//getter and setter

	public int[] getScores() {
		return scores;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}


	@Override
	public String toString() {

		return "Scoreboard (scores=" + Arrays.toString(scores) + ")";
	}
	
	
	
	
}
