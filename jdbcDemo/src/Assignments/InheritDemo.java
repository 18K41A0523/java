package Assignments;

public class InheritDemo {
	int StudentId;
	String StudentType;
	String StudentName;
	int Studentfees;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentType() {
		return StudentType;
	}
	public void setStudentType(String studentType) {
		StudentType = studentType;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getStudentfees() {
		return Studentfees;
	}
	public void setStudentfees(int studentfees) {
		Studentfees = studentfees;
	}
	public void getDetails() {
		System.out.println("StudentId:"+StudentId);
		System.out.println("StudentName:"+StudentName);
		
	}

}
