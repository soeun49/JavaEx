package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
//		sortEx();
//		sortCustomEx();
		searchEx();
	}
	
	//배열 내 검색
	private static void searchEx() {
		//기본 타입 
		//자바는 기본적으로 이진 검색
		//이진 검색은 검색 이전의 먼저 배열이 정렬되어 있어야 함 
				
		Integer num2[] = {5,6,3,2,4,1,7,9,8,10};
		Arrays.sort(num2);
		System.out.println("정렬된 원본:" + Arrays.toString(num2));
		
		int index= Arrays.binarySearch(num2, 8);
		System.out.println("8의 인덱스:" + index);
		
		//String 배열의 검색
		String [] str= {"Java", "C", "C++", "Python", "Linux"};
		Arrays.sort(str); //검색 이전의 정렬 필수!
		System.out.println("원본:" + Arrays.toString(str));
		index= Arrays.binarySearch(str, "Python");
		System.out.println("Python의 인덱스:"+ index);
		
		//사용자 정의 객체의 검색
		Member[] members= {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산")
		};
		Arrays.sort(members);
		System.out.println("원본:" + Arrays.toString(members));
		index= Arrays.binarySearch(members, new Member ("홍길동"));
		System.out.println("홍길동의 인덱스:"+ index);
	}
	//정렬 (사용자 정의 클래스)
	private static void sortCustomEx() {
		Member[] members= {
				new Member ("홍길동"),
				new Member("고길동"),
				new Member("장길산")
		};
		System.out.println("원본 배열:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬: " + Arrays.toString(members));
		Arrays.sort(members,Collections.reverseOrder()); //내림차순 정렬
		System.out.println("정렬(내림차순): " +  Arrays.toString(members));
	}
	
	//정렬
	private static void sortEx() {
		//기본형 검색
		int [] nums = {5,6,3,2,4,1,7,9,8,10};
		
		System.out.println("원본:" + Arrays.toString(nums));
		//정렬
		Arrays.sort(nums);//오름차순 순으로 정렬됨 
		System.out.println("정렬 후 (오름차순):" + Arrays.toString(nums));
		
		Integer num2[] = {5,6,3,2,4,1,7,9,8,10};
		System.out.println("원본: " +Arrays.toString(num2));

		//정렬 내림차순
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println("정렬 후 (내림차순):" + Arrays.toString(num2));
			
	}
		


	private static void copyArrayEx() {
		int arr[] = new int [] {
				1,2,3,4,5,6,7,8,9,10
		};
		int target [] = new int [arr.length];
		// 방법1: 루프를 돌면서 복사
		for(int i=0; i<arr.length;i++) {
			target[i] = arr[i]; // 복사			
		}
		System.out.println("배열 복사(for 문):" + Arrays.toString(target));
		//방법 2: System객체 이용해서
		System.arraycopy(arr, //원본 배열
				0, //복사 시작 위치
				target, //목적지
				0, //복사 시작 위치 (목적지에서)
				arr.length); //복사할 길이
		System.out.println("배열복사(System):" + Arrays.toString(target));
		// 방법 3: Arrays.copyOf
		target= Arrays.copyOf(arr, //원본 배열
				arr.length); //복사할 길이
		System.out.println("배열복사(Arrays.copyOf):" + Arrays.toString(target));
		//방법 4: Arrays.copyRangeOf
		target= Arrays.copyOfRange(arr, //원본 배열
				5, //시작 인덱스
				arr.length);//끝 인덱스
		System.out.println("일부 복사 (Arrays.copyOfRange):" + Arrays.toString(target));
	}
	
	private static void printArrayEx() {
		int arr[] = new int [] {
				1,2,3,4,5,6,7,8,9,10
		};
		
		//출력
		System.out.println("arr[]:" + arr);
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Arrays.toString();
		System.out.println("arr[]:" +Arrays.toString(arr));
	}
}
