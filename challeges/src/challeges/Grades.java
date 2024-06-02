package challeges;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Grade Calculator..");
		
		System.out.print("Please enter your Percentage");
		float percentage = sc.nextFloat();
		
		
		
		if(percentage >=89 && percentage <= 100 ) 
		{
			System.out.println("Your Grade is : O");
		}
		else if(percentage >= 70 ) 
		{
			System.out.println("Your Grade is : A");
		}
		else if(percentage >= 50 )
		{
			System.out.println("Your Grade is : B");
		}
		else if(percentage >= 35)
		{
			System.out.println("Your Grade is : C");
		}
		else {
			System.out.println("Fail");
		}
		
		
	}

}
