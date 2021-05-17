package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//Scanner로 키워드 입력
//first_name, last_name 필드 대상 부분 검색
// 이름, 성, email, 전화번호, 입사일 출력 
public class HRSearchEmployeesPSTMT {

	public static void main(String[] args) {
		Connection conn = null; //커넥션
//		Statement stmt = null; //문맥
		PreparedStatement pstmt= null;
		ResultSet rs = null; //결과 
		Scanner scanner = new Scanner (System.in);
		
		try {
			conn= DBConfig.getConnection();
			
			System.out.print("검색어:");
			String keyword = scanner.next();
			
			
			// 쿼리를 PreparedStatement에 맞게 바꿔보자
//			String sql = "SELECT first_name, last_name, email, phone_number, hire_date" +
//						" FROM employees" + 
//						" WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + 
//						"%' OR " + " lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
			String sql= "SELECT first_name, last_name, email, phone_number, hire_date" +
						" FROM employees" +
						" WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			System.out.println("Template: " + sql); 
			
			//실행 계획 마련 -> LIKE 검색 시의 TIP
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%"); //바인딩 할 값에 와일드 카드를 포함 전달해도 됨 
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
//			stmt=conn.createStatement();
			
			
			//쿼리 수행
			rs = pstmt.executeQuery();
			//Loop
			while (rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String email = rs.getString("email");
				String phoneNumber =rs.getString("phone_number");
				String hireDate = rs.getString("hire_date"); 
				
				//출력
				System.out.printf("%s %s: %s, %s, %s%n", firstName, lastName, email,phoneNumber,hireDate);
			}
			scanner.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { 
				rs.close();
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				
			}
		}
	
	}

}
