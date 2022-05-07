package com.student.maneger;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String stuentCity;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStuentCity() {
		return stuentCity;
	}
	public void setStuentCity(String stuentCity) {
		this.stuentCity = stuentCity;
	}
	public Student(int studentId, String studentName, String studentPhone, String stuentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.stuentCity = stuentCity;
	}
	public Student(String studentName, String studentPhone, String stuentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.stuentCity = stuentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", stuentCity=" + stuentCity + "]";
	}
	
	
	
}

