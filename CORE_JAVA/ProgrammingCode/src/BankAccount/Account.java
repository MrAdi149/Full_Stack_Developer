package BankAccount;

public class Account extends Bank {
	
	String accountType = "Saving";
	void openAccount() {
		System.out.println("your account type is: " + accountType + " and your bank name is " + bankName);
	}
	
}
