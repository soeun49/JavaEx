package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
		sortEx();
		searchEx();
	}
	//정렬
	private static void sortEx() {
		//기본형 검색
		int [] nums = {5,6,3,2,4,1,7,9,8,10};
		
		System.out.println("원본:" + Arrays.toString(nums));
		//정렬
		Arrays.sort(nums);//오름차순 순으로 정렬됨 
		System.out.println("정렬 후 (오름차순):" + Arrays.toString(nums));
		
//		nums = new int []{5,6,3,2,4,1,7,9,8,10};
//		System.out.println("원본:" + Arrays.toString(nums));
		//정렬 내림차순
//		Arrays.sort(nums,Collections.reverseOrder());
	}
	
	
	//배열 내 검색
	private static void searchEx() {
		
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
