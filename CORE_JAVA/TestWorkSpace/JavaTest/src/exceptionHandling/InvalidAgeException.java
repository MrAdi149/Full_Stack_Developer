package exceptionHandling;

public class InvalidAgeException extends RuntimeException {
	
	String message;
	
	InvalidAgeException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
