package com.student.maneger;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con; 
	public static Connection createC() {
		//load the driver
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create the connection...
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			 e.printStackTrace();
			 
		}
		
		return con;
	}

}
