//wajp to find area of rectangle, area of circle, circumference of circle, perimeter of rectangle

import java.util.Scanner;

class Area {
	
	int length;
	int breadth;
	int radius;
	
	int areaRect(int len,int brd){
		this.length = len;
		this.breadth = brd;
		
		int area = len * brd;
		
		return area;
	}
	
	double circumCir(int rad){
		this.radius = rad;
		
		double circum = 2 * 3.14 * rad;
		
		return circum;
	}
	
	double areaCir(int rad){
		this.radius = rad;
		
		double area = (3.14 * rad * rad);
		
		return area;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int len = sc.nextInt();
		System.out.print("Enter the breadth: ");
		int bre = sc.nextInt();
		System.out.print("Enter the radius: ");
		int rad = sc.nextInt();
		
		Area a = new Area();
		System.out.println("area of rectangle: " + a.areaRect(len,bre));
		System.out.println("area of circle: " + a.areaCir(rad));
		System.out.println("circumference of circle: " + a.circumCir(rad));
		System.out.println("perimeter of rectangle: " + 2 * (len + bre));
	}
}
		