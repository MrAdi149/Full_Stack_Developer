package interfaceTest;

public class Cat implements Animal,Bird {

	
	@Override
	public void makeSound() {
		System.out.println("cat sound");
	}

	
	@Override
	public void make() {
		System.out.println("hello adi");
	}
	
}
