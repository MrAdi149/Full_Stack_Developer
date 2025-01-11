class City {
	int pinCode;
	String cityName;
	
	City(int pin, String city){
		this.pinCode = pin;
		this.cityName = city;
	}
	
	public static void main(String[] args){
		City c1 = new City(123,"Patna");
		System.out.println(c1.pinCode + " " + c1.cityName);
		
		City c2 = new City(456,"Bengaluru");
		System.out.println(c2.pinCode + " " + c2.cityName);
	}
}