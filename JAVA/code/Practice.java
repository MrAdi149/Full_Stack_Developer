class Practice{
	int age = 40;
	
	Practice(){
		this.age = 20;
	}
	
	Practice(int num){
		num = 30;
		this.age = num;
	}
	
	Practice(int age){
		this.age = age;
	}
	
	{
		this.age = 70;
	}
	
	public static void main(String[] args){
		Practice p = new Practice();
		System.out.println(p.age);
		p.age = 50;
		System.out.println(p.age);
		Practice p1 = new Practice(90);
		System.out.println(p.age);
	}	
}