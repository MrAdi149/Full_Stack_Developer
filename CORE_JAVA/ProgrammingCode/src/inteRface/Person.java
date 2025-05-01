package inteRface;

public interface Person {

	
	String name = "Aditya";
	
	void work();
	
	default int hello() {
		return 0;
	}
}
