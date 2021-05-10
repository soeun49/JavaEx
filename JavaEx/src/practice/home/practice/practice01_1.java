package practice.home.practice;

import java.util.Scanner;

public class practice01_1 {

	
//5장 연습문제	
	public static void main(String[] args) {
		Ex7();
		Ex8();
		Ex9();
		
	}
	
//#9 
	private static void Ex9() {
	
	boolean run = true;
	int studentNum=0;
	int [] scores = null; 
	Scanner scanner = new Scanner(System.in);
	
	while (run) {
		System.out.println("-------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택>");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo ==1) {
			System.out.print("학생수> ");
			studentNum=scanner.nextInt();
			scores= new int[studentNum];
		}else if (selectNo==2) {
			for(int i=0; i<scores.length;i++) {
				System.out.println("scores [" + i + "]>");
				scores[i]= scanner.nextInt();
			}
		} else if (selectNo==3) {
			for(int i=0; i<scores.length;i++) {
				System.out.println("scores [" + i + "]:" + scores [i]); 
			}
		}else if (selectNo==4) {
			int max=0;
			int sum=0;
			double avg =0;
			
			for (int i=0; i<scores.length;i++) {
				max = (max<scores[i])? scores [i]:max;
				sum+= scores[i];
			}
			avg= (double)sum/ studentNum;
			System.out.println("최고점수: " + max);
			System.out.println("평균점수: " + avg);
			
		}	else if(selectNo==5) {
			run=false;
			break;
			
		} }
		System.out.println("프로그램 종료");
		scanner.close();
		
		
			
	}
	
//#8 전체 항목의 합과 평균값 구하기
	
	private static void Ex8() {
	int[][]array= {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
	};
	
	int sum=0;
	double avg= 0.0;
	
	int count =0;
	for(int i=0; i<array.length; i++) {
		for (int j=0; j<array[i].length;j++) {
			sum += array[i][j];
			count++;
		}
	}
	
	avg = (double)sum/count;
	
	System.out.println("sum: "+ sum);
	System.out.println("avg: " + avg);
	
	}
	
	
	//#7 최대값 구하기
	private static void Ex7()	{

		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int i=0; i<array.length;i++) {
			if (max<array[i]) {
				max=array[i];
			}
		}
			
		System.out.println("max: " + max);
		
	}
}
