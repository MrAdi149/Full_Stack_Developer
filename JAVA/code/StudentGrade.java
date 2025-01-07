class StudentGrade{
	public static void main(String[] args){
		//wajp to take student percentage and display the grade of student
		int marks = 95;
		if(marks >90 && marks < 100){
			System.out.println("Grade A");
		}else if(marks > 80 && marks < 90){
			System.out.println("Grade B");
		}else if(marks > 70 && marks < 80){
			System.out.println("Grade C");
		}else if(marks > 50 && marks < 70){
			System.out.println("Grade D");
		}else if(marks > 35 && marks < 50){
			System.out.println("Grade E");
		}else{
			System.out.println("Fail");
		}
	}
}