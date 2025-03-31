package exceptionHandling;

public class NegativeNumberException extends RuntimeException {
	
	String message;
	
	NegativeNumberException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
