package challeges;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Welcome to greatest NUmber calculator..!");
		
		System.out.print("Enter First Number: ");
		int  num1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Third Number: ");
		int num3 = sc.nextInt();
		
		
		
		
		//short circuit happens in here 
//		suppose in && operator if both condition is true 
//		then only it will send u true other wise it will 
//		show you false so if first condition is false then second 
//		condition will no need to execute or check it will automatically give result in false
	
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("Number First is greatest " + num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			
			System.out.println("Number Second is greatest " + num2);
		}
		else if(num3 >= num2 && num3 >= num1) {
			System.out.println("Number Third is greatest "  +num3);
		}
		else {
			System.out.println("All Number are 'equal'");
		}
		
	}

}
