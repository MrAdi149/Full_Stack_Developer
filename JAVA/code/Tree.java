class Tree{
	int height;
	int age;
	String type;
	
	public static void main(String[] args){
		
		Tree t1 = new Tree();
		t1.height = 25;
		t1.age = 10;
		t1.type = "Coconut Tree";
		
		System.out.println(t1.type + " " + ",age: " + t1.age + " " + ",height: " + t1.height);
		
		Tree t2 = new Tree();
		t2.height = 60;
		t2.age = 50;
		t2.type = "Peepal Tree";
		
		System.out.println(t2.type + " " + ",age: " + t2.age + " " + ",height: " + t2.height);
		
	}
}