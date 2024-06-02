package challeges;

import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		System.out.println("Welcome to Simple Interest Calculator..!");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle value: ");
		double principle = sc.nextDouble();
		
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter Time duration: ");
		double time = sc.nextDouble();
		
		
		double SI = (principle * time * rate) / 100;
		System.out.println("Simple Interest is : " + SI);
		
		
	}
	

}
