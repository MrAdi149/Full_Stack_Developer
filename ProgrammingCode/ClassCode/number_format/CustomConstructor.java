class CustomConstructor{
	String name;
	int age;
	
	CustomConstructor(){
		this.name = "Aditya";
		this.age = 24;
	}
	
	public static void main(String[] args){
		
		CustomConstructor c = new CustomConstructor();
		System.out.println(c.name + " " + c.age);
	}
}
		