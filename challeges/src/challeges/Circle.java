package challeges;

import java.util.Scanner;

public class Circle {
	double radiusInMm;
	Circle(double radiusInMm){
		this.radiusInMm = radiusInMm;
	}
	
	double getCircumfernce() {
		return 2 * radiusInMm * Math.PI;
		
	}
	double getArea() {
		return Math.PI * Math.pow(radiusInMm , 2);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the world of Circle..\n\n");
		System.out.print("Please, enter the radius: ");
		double radius = sc.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println(circle);
		
		
	}

	@Override
	public String toString() {
		return "Circle [radiusInMm=" + radiusInMm + ", getCircumfernce()=" + getCircumfernce() + ", getArea()="
				+ getArea() + "]";
	}

}
