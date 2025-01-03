class Quiz{
	int i = 100;
	
	{
		System.out.println(i);
		System.out.println(this.i);
		
		int i = 50;
		
		System.out.println(i);//shadowed the variable
		System.out.println(this.i);//global variable
		
		this.i = i; // we can change the global variable inside the block also.
		System.out.println(this.i);
	}
	
	public static void main(String[] args){
		new Quiz();
	}
	
	{
		System.out.println(i);
		System.out.println(this.i);
	}
}