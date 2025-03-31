package employee;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	public void setAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void setAccountBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccount() {
		return this.accountNumber;
	}
	
	public String getAccountName() {
		return this.accountHolderName;
	}
	
	public int getAccountBalance() {
		return this.balance;
	}
}
