package abstractClass;

public class AreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Circle();
		
		double area = shape.calculateArea(12);
		System.out.println("area of circle: " + area);
		
		double perimeter = shape.calculatePerimeter(12);
		System.out.println("perimeter of circle: " + perimeter);
	}

}
