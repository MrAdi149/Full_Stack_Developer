package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t = new Triangle();
		System.out.println(t.type);
		t.draw();
		t.drawTriangle();
		
		System.out.println("--------------------");
		
		Square s = new Square()
		System.out.println(s.length);
		s.draw();
		s.drawSquare();
		
		System.out.println("--------------------");
		
		Circle c = new Circle();
		System.out.println(c.radius);
		c.draw();
		c.drawCircle();
		

	}

}
