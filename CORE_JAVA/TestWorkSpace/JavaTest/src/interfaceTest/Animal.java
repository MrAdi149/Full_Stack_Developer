package interfaceTest;

public interface Animal {

	
	void makeSound();
	
	default void make() {
		System.out.println("hello");
	}
}
