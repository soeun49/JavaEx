package com.javaex.jdbc.oracle;

import java.sql.*;

//계정의 사원이름과 매니저 이름을 함께 출력해 보자
//사원이름은 이름 성 순으로 표기
//정렬은 사원 이름 내림 차순 


public class HREmpList {

	public static void main(String[] args) {
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs= null;
		
		try {
			conn = DBConfig.getConnection();
			stmt=conn.createStatement();
			
			String sql= "SELECT e.first_name, e.last_name, m.first_name || ' '||  m.last_name as ManagerName"
					+ " FROM employees e LEFT OUTER JOIN employees m"
							+ " ON e.manager_id=m.employee_id" + " ORDER BY first_name DESC";
			
			rs= stmt.executeQuery(sql);
			
			while (rs.next()) {
				String first_name= rs.getString(1);
				String last_name=rs.getString(2);
				String ManagerName=rs.getString(3);
				
				System.out.printf("%s:%s:%s%n", first_name, last_name, ManagerName);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				
			}
		}
	}

}
