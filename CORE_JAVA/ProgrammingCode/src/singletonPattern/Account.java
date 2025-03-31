package singletonPattern;

public class Account {
	
	private static Account ac = null;
	
	private Account() {
		System.out.println("Object created");
	}
	
	public static void helperMethod() {
		
		if(ac == null) {
			ac = new Account();
		}else {
			System.out.println("already created");
		}
	}

}
