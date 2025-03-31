package employee;

public class Student {

	
	private int studentId;
	private String studentName;
	private String grade;
	
	public void setStudent(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int getStudent() {
		return this.studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getGrade() {
		return this.grade;
	}
}
