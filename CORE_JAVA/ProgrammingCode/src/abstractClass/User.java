package abstractClass;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAccount = new SavingAccount();
		
		bankAccount.deposit(3000);
		bankAccount.withdraw(100);

	}

}
