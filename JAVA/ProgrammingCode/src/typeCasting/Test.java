package typeCasting;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle();
		v1.Start();
		
		//upcasting
		Vehicle v2 = new Car();
		v2.Start();
		
		//downcasting
		Car c = (Car)v2;
		c.Stop();
		c.CarStop();
	}

}
