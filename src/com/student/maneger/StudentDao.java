package com.student.maneger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		
		// jddbc code...
		try {
			Connection con = CP.createC();
			String  q = "insert into students(sname, sphone,scity) values(?,?,?)";
			//Preparedstatement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStuentCity());
			
			// execute..
			pstmt.executeUpdate();
			f=true;
			
			
		}catch (Exception e){
			//TODO: handle exception
			e.printStackTrace();
			
		}
		return f;
		
	}

}
