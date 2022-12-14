package edu.kh.jsp.student.model.vo;

public class Student {
	private String studentNo;		// 학번
	private String studentName;		// 이름
	private String studentAddress;	// 주소
	private String deoartmentName;	// 학과명
	
	
	public Student() {
	}


	public Student(String studentNo, String studentName, String studentAddress, String deoartmentName) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.deoartmentName = deoartmentName;
	}

	

	public Student(String studentAddress) {
		super();
		this.studentAddress = studentAddress;
	}


	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getDeoartmentName() {
		return deoartmentName;
	}
	public void setDeoartmentName(String deoartmentName) {
		this.deoartmentName = deoartmentName;
	}


	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", deoartmentName=" + deoartmentName + "]";
	}
	
	
	
	
	
	
	
}
