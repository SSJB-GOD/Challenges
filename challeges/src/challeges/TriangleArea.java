package challeges;
import java.util.*;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to Triangle Area..!");
		System.out.println("Enter value of Base: ");
		double base = sc.nextDouble();
		System.out.println("Enter value of Height: ");
		double height = sc.nextDouble();
		
		double triangleArea = ( base * height)/2;
		
		System.out.println("Area of Triangle is: "+ triangleArea +"cms");
		
		
	}

}
