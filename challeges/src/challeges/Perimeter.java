package challeges;
import java.util.*;
public class Perimeter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to perimeter..!");
		
		System.out.println("Please Enter all Four Sides in cms: ");
		double firstSide = sc.nextDouble();
		double secondSide = sc.nextDouble();
		double thirdSide = sc.nextDouble();
		double fourthSide = sc.nextDouble();
		
		double perimeter = firstSide + secondSide + thirdSide +fourthSide;
		System.out.println("perimeter of your rectangle is: "+perimeter+"cm");
		
	}

}
