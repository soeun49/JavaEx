package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard s1= new Scoreboard (new int [] {10,20,30,40});
		System.out.println("s1= " +s1);
		
		//참조 복제
		Scoreboard s2= s1;
		System.out.println("s1==s2? " + (s1==s2));
		
		//얕은 복제
		s2=s1.getClone();
		System.out.println("s2= " +s2);
		
		
		//확인
		System.out.println("s1==s2? " + (s1==s2));
		//얕은 복제의 경우 참조 필드는 주소 값이 복사됨
		System.out.println("s1.scores == s2.scores? " + (s1.getScores() == s2.getScores()));
		
		s2.getScores()[2] = 100; 
		//얕은 복제의 경우: 참조 필드가 같은 객체이기 때문에 not only s2 but also s1의 값도 바뀜!
		//하지만 깊은 복제의 경우 s1의 값은 바뀌지 않음. 
		System.out.println("s1= " +s1);
		System.out.println("s2= " +s2);
}
}
