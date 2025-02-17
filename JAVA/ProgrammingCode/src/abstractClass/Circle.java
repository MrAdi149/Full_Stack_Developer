package abstractClass;

public class Circle extends Shape {
	
	double radius;
	final double pi = 3.14;

	@Override
	double calculateArea(double radius) {
		this.radius = radius;
		
		return pi*this.radius;
	}
	
	@Override
	double calculatePerimeter(double radius) {
		
		this.radius = radius;
		return 2 * pi * this.radius;
	}
}
