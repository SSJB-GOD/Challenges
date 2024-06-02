package challeges;

import java.util.Scanner;

public class AgeGroup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please enter your Age");
		int age = sc.nextInt();
		
		
		
		if(age <= 13 ) 
		{
			System.out.println("Your Comes Under : Child ");
		}
		else if(age <=20 ) 
		{
			System.out.println("Your Comes Under : Teen");
		}
		else if(age <= 40 )
		{
			System.out.println("Your Comes Under : Adult");
		}
		else if(age <= 60)
		{
			System.out.println("Your Comes Under : Senior");
		}
		else 
		{
			System.out.println("Your Come Under : Elders");
		}
	}

}
