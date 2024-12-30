class Flower{
	String type = "Gerbera";
	String color;
	
	public static void main(String[] args){
		Flower f1 = new Flower();
		f1.color = "white";
		
		Flower f2 = new Flower();
		f2.color = "Red";
		
		Flower f3 = new Flower();
		f3.color = "Yellow";
		
		System.out.println(f1.type);
		System.out.println(f1.color);
		System.out.println(f2.color);
		System.out.println(f3.color);

	}
}