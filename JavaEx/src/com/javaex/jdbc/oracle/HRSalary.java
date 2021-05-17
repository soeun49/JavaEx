package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//사용자로부터 최소 급여와 최대 급여를 입력 받아서 
//급여가 범위 내에 속하는 사원의 목록을 출력 
public class HRSalary {

	public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs= null;
			
			try {
				Scanner scanner = new Scanner (System.in);
				System.out.print("최소 급여: ");
				int minSalary = scanner.nextInt();
				System.out.print("최대 급여: ");
				int maxSalary = scanner.nextInt();
				
				//값 뒤집기
//				int temp= minSalary;
//				minSalary=maxSalary;
//				maxSalary=temp;
				
				conn= DBConfig.getConnection();	
				
				String sql = "SELECT first_name || ' ' || last_name as name, salary" +
							" FROM employees WHERE salary Between " + minSalary +
							" and " + maxSalary + " ORDER BY salary DESC";
				
				stmt= conn.createStatement();
				
			
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					String name=rs.getString(1);
					int salary =rs.getInt(2);
					
					System.out.printf("%s - %d%n", name, salary);

				
			}
			scanner.close();
							
	}catch (SQLException e){
		e.printStackTrace();
	}finally {
		try {
			rs.close();
			conn.close();
			stmt.close();
			
		}catch(Exception e)  {
			
		}
	}
	
	
	}
	
}
