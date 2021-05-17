package com.javaex.jdbc.oracle;

import java.sql.*; // JDBC API load 
public class ConnectionTest {

	
	public static void main(String[] args) {
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		
		try {
		// Driver load
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Connection 생성
		conn= DriverManager.getConnection(DBConfig.DBURL, //db 접속 URL
											dbuser,dbpass); 
		System.out.println(conn);
		System.out.println("연결 성공!");
		// Statement 생성
		// 질의 수행
		// 결과 처리
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}catch (SQLException e) {
			System.err.println("SQLError!");
		}finally {
			try { 
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
