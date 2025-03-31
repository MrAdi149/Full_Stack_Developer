package exceptionHandling;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		try {
			throw new CustomException("custom exception executed");
		}catch(CustomException c) {
			System.out.println("catch block executed " + c.getMessage());
		}

	}

}
