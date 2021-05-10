package practice.home.practice.oop;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
	
		Friend [] friendArray = new Friend [3];  
		Scanner scanner= new Scanner (System.in);
		System.out.println("친구를 등록해주세요.");
		
		String [] name;
		String [] number;
		String [] school;
		
		name = new String [friendArray.length];
		number = new String [friendArray.length];
		school = new String [friendArray.length];
		
		for (int i=0; i<friendArray.length;i++) {
			
			name[i] =scanner.next();
			number[i] = scanner.next();
			school[i]= scanner.next();
			
			
			Friend f1= new Friend();
			f1.setName(name[0]);
			f1.setNumber(number[0]);
			f1.setSchool(school[0]);
			
			Friend f2= new Friend();
			f2.setName(name[1]);
			f2.setNumber(number[1]);
			f2.setSchool(school[1]);
			
			Friend f3= new Friend();
			f3.setName(name[2]);
			f3.setNumber(number[2]);
			f3.setSchool(number[2]);
			
			
			System.out.printf("%s, %s, %s %n", 
					f1.getName(), f1.getNumber(),
					f1.getSchool());
	
			System.out.printf("%s, %s, %s %n", 
					f2.getName(), f2.getNumber(),
					f2.getSchool());
			System.out.printf("%s, %s, %s %n", 
					f3.getName(), f3.getNumber(),
					f3.getSchool());
	
			f1.showInfo();
			f2.showInfo();
			f3.showInfo();

		}
		scanner.close();
		
		}
	}

		
	


