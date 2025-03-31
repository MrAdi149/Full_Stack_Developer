package interfaceTest;

public interface Bird extends Animal {

	
	@Override
	default void make() {
		System.out.println("i am inside the bird");
	}
}
