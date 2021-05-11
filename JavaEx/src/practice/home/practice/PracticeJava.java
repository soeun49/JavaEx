package practice.home.practice;

public class PracticeJava {

	public static void main(String[] args) {
		Scores();
		Add();
		Result();
	}
	
	private static void Result() {
		
	
	int num = 120;
	int result = num >= 100 ? num - 10 : num + 10;
	System.out.println(result);
	}
	
	private static void Scores() {
		

	int [][] scores = {
			{ 90, 70, 80, 75, 80 },
				{ 77, 90, 65, 80, 90 },
				{ 80, 75, 95, 80, 75 },
				{ 75, 80, 90, 85, 90 }
			};
	
	int total = 0;
	int count =0;
	
	for (int i=0; i<scores.length; i++) {
		for (int j=0; j<scores[i].length;j++) {
			if(scores[i][j] %2==1) {
				total += scores[i][j]; 
				count++;
				
			}
				System.out.println(scores[i][j]);
			} 
			
	
}
		
		System.out.printf("총합: %d%n",total);
	}

		private static void Add() {
			int total=0;
			int count=0;
		
			
			for (int i=1; i<=100;i++) {
				System.out.println(i);
			
				if(i %2!=0) {
					count++;
					total += i;
				}
			}
		
			System.out.printf("총합: %d.%n",total);
		}
		
}
	



