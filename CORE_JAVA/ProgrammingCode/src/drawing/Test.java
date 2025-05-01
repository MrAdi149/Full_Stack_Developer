package drawing;

public class Test {
	
	public static void main(String[] args) {
		
		Sketchpen sp1 = new Sketchpen();
		Sketchpen sp2 = sp1;
		
		System.out.println(sp1 + " " + sp2);
		
		Pen p = sp1;
		
		System.out.println(p);
		
		Pen p1 = new MarkerPen();
		Pen p2 = p;
		
		System.out.println(p2);
				
//		MarkerPen mp = p;
		
		MarkerPen mp1 = (MarkerPen)p1;
		Sketchpen sp3 = (Sketchpen)p1;
		
	}

}
