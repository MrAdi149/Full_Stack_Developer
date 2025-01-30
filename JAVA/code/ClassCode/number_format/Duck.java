class Duck{
	public static void main(String[] args){
		int n = 11;
		int firstDigit = n;
		boolean flag = false;
		
		while(n!=0){
			int digit = n % 10;
			if(digit == 0){
				flag = true;
				break;
			}
			n = n / 10;
		}
		
		if(flag == true){
			System.out.println("duck number");
		}else{
			System.out.println("not duck");
		}
	}
}