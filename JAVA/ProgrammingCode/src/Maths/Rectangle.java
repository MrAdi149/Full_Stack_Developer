package Maths;

public class Rectangle extends Shape {
	
	int length;
	int breadth;
	int height;
	
	Rectangle(){
		super(5);
		this.length = 5;
		this.breadth = 3;
		this.height = 4;
		System.out.println("length: " + this.length);
		System.out.println("breadth: " + this.breadth);
		System.out.println("height" + this.height);
	}

}
