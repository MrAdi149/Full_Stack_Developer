package exceptionHandling;

public abstract class ThrowsException {
	
	void NumberCounting() throws ArithmeticException {
		for(int i = 0; i<10; i++) {
			System.out.println(i/i);
		}
	}
	
	abstract void array() throws ArrayIndexOutOfBoundsException;

}