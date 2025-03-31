package encapsulation;

public class Demo {
	
	public static void main(String[] args) {
        BankAccountClass account = new BankAccountClass(123456, "Aditya Kumar Singh", 1000);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(731);
        account.withdraw(412);
        account.withdraw(9893); 

        account.setBalance(-100); 
        System.out.println("Current Balance: " + account.getBalance());
    }
}
