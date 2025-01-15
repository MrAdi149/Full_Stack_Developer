class Laptop{
	int price;
	String brand;
	String ramCapacity;
	
	Laptop(){
		this.price = 120;
		this.brand = "lenovo";
		this.ramCapacity = "8Gb";
	}
	Laptop(int pr,String br, String rc){
		this.price = pr;
		this.brand = br;
		this.ramCapacity = rc;
	}
	
	public static void main(String[] args){
		Laptop l1 = new Laptop();
		System.out.println("price: "+l1.price+" brand: "+l1.brand+" ram: "+l1.ramCapacity);
		Laptop l2 = new Laptop(20000,"dell","8gb");
		System.out.println("price: "+l2.price+" brand: "+l2.brand+" ram: "+l2.ramCapacity);
	}
}

		