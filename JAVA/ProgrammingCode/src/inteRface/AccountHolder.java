package inteRface;

public class AccountHolder implements HDFC {
	
	@Override
	public void deposit() {
		System.out.println("amount deposited");
	}
	
	@Override
	public void withDraw() {
		System.out.println("amount withdraw");
	}

	public static void main(String[] args) {
		AccountHolder ah = new AccountHolder();
		ah.deposit();
		ah.withDraw();
	}
}
