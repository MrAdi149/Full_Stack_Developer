package JavaLibrary;

public class Student {
	
	int age;
	
	Student(int age){
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		
		return this.age == stu.age;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(20);
		Student s2 = new Student(20);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
