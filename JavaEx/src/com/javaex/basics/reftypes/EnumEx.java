package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		enumBasic();
		enumEx();
		

	}

	private static void enumEx() {
		//Conditional Ex. switchEx3() --> enum 버전
		
		Week today= Week.FRIDAY; 
		
		String act = "";
		//Monday~ Thursday : act ;  열공
		// Friday: act ; 불금 
		// Saturday: act ; 주말
		// Sunday: act; 휴식
		
		
		switch (today) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		act = "열공";
		break;
		
		case FRIDAY:
			act =  "불금";
			break;
		
		case SATURDAY:
			act =  "주말";
			break;
			
		case SUNDAY:
			act = "휴식";
			break;
			default:
				act = "?";
		}
		
		System.out.printf("%s에는 %s.%n", today.name(),act);
	}
	
	private static void enumBasic () {
		//enum의 매서드들 
		Week today = Week.TUESDAY;
		System.out.printf("Today is %s(%d).%n", 
				today.name(), // 열거 상수의 문자열
				today.ordinal()); // 순번; C와 Java는 0부터 시작함 
		
		String dayStr = "FRIDAY"; //문자열을 열거상수로 바꾸기
		Week other = Week.valueOf(dayStr); 
	
		System.out.printf("Other is %s(%d).%n", other.name(), other.ordinal());
		
		//순번 비교
		int diff= today.compareTo(other);
		System.out.println("today와 other의 순번차:" + diff);
	}
}
