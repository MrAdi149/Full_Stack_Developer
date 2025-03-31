package inteRface;

public class emp extends TY implements JSP,QSP {
	
	@Override
	public void develop() {
		System.out.println("developer");
	}
	
	@Override
	public void test() {
		System.out.println("tester");
	}
	
	public static void main(String[] args) {
		emp e = new emp();
		
		e.work();
		e.develop();
		e.test();
	}

}
