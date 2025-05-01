public class Demo {
	
	int x = 5;
	int y = 6;


    public Demo(int x, int y) {
		this.x = x;
		this.y = y;
		return;
    }

	void add(int x, double y){

		System.out.println("no wrapper class");

	}

	void add(Integer x, double y){
		System.out.println("wrapper class");
	}


	public static void main(String[] args) {

		Demo d = new Demo(3, 4);

		System.out.println(d.x+" "+d.y);

		Integer x = 7;

		d.add(x,5.6);
		
	}
	
	
	
}
	