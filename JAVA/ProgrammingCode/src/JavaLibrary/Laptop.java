package JavaLibrary;

public class Laptop {
	
	String brand;
	int cost;
	int ramSize;
	
	Laptop(String brand, int cost, int ramSize){
		this.brand = brand;
		this.cost = cost;
		this.ramSize = ramSize;
	}
	
	@Override
	public String toString() {
		return "brand: " + brand + " cost: " + cost + " ramSize: " + ramSize;
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenovo",12,13);
		Laptop l2 = new Laptop("Dell",11,14);
		Laptop l3 = new Laptop("Asus",14,15);
		Laptop l4 = new Laptop("Samsung",18,10);
		
		Laptop[] l = {l1,l2,l3,l4};
		
		for(int i = 0; i<l.length; i++) {
			System.out.println(l[i]);
		}
	}

}
