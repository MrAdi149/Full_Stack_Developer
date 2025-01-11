class PenWork{
	String name;
	int price;
	
	void write(){
		this.name = "blue";
		System.out.println(this.name);
		System.out.println(this.price);
	}
	
	void PenWork(){
		System.out.println("it is constructor or method?");
	}
	
	public static void main(String[] args){
		PenWork p = new PenWork();
		p.write();
		p.PenWork();
	}
}