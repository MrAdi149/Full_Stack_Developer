package abstractClass;

public class SavingAccount extends BankAccount {
	
	int balance = 1000;
	
	@Override
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("balance of user is: " + balance);
	}
	
	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("balance of user is: " + balance);
	}

}
