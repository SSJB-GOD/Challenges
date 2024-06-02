package challeges;

import java.util.*;
public class CompoundInterest {

	public static void main(String[] args) {
		System.out.println("Welcome to Bank");
		Scanner  sc = new Scanner (System.in);
		
		System.out.print("Please enter the Principle amount Rs");
		double principle = sc.nextDouble();
		
		System.out.print("Now enter the Rate of interest: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time duration: ");
		double time = sc.nextDouble();
		
		double CI = principle * Math.pow((1+rate/100), time);
		System.out.println("Your Compound Intrest is: "+CI);
	}
}
