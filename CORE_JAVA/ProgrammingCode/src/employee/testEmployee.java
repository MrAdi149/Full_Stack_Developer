package employee;

public class testEmployee {

	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccount(149);
		System.out.println(b.getAccount());
		
		b.setAccountName("Aditya");
		System.out.println(b.getAccountName());
		
		b.setAccountBalance(2000);
		System.out.println(b.getAccountBalance());
		
		Student s = new Student();
		
		s.setStudent(123);
		System.out.println(s.getStudent());
		
		s.setStudentName("Aditya");
		System.out.println(s.getStudentName());
		
		s.setGrade("A+");
		System.out.println(s.getGrade());
	}
	
}
