class Pen{
	
	String color = "red";
	String type = "marker";
	int price = 30;
	
	public static void main(String[] args){
		Pen p1 = new Pen();
		p1.write();
		System.out.println(p1);
	}
	
	void write(){
		System.out.println("write anything");
	}
	
}