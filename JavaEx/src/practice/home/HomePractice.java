package practice.home;

public class HomePractice {
public static void main (String [] args) {
	ifEx();
	ifEx2();
	ifEx3();
}
	


private static void ifEx() {
	int score= (int)(Math.random()*20)+81;
	System.out.println("점수= " + score);
	
	String grade;
	
	if (score>= 90) {
		if (score>=95) {
			grade = "A+";
		} else {
			grade = "A";
		} }
		else {
		if (score >=85) {
			grade = "B+";
		} else {
			grade = "B";
		}
		}
		System.out.println("학점: " + grade);
		
	}
	
private static void ifEx2() {
	int time= (int)(Math.random()*4)+8;
	System.out.println("현재시간: " + time + "시");
	
	switch (time) {
	case 8: System.out.println("출근합니다");
	case 9: System.out.println("회의를 합니다");
	case 10: System.out.println("업무를 봅니다");
	default: System.out.println("외근 중 입니다");
}
}
private static void ifEx3() {
	int sum=0;
	for(int i=1; i<=100; i++) {
		sum=sum+1;
	
	}
	System.out.println("1~100까지의 합: " + sum);
}
}


