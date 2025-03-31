class Account{
	long accountNumber;
	String name;
	double balance;
	
	Account(){
		this.accountNumber = 123456789l;
		this.name = "Aditya";
		this.balance = 1234;
	}
	
	public static void main(String[] args){
		Account ant = new Account();
		System.out.println(ant.accountNumber + " " + ant.name + " " + ant.balance);
	}
}