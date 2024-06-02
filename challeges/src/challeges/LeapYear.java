package challeges;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Leap year Calculator\n\n");
		
		System.out.print("Please enter any Year:");
		int year  = sc.nextInt();
		
		if(year % 400 ==0  || (year % 4 ==0 && year % 100 !=0) ) {
			System.out.println("This "+ year + "Year is LEAP year..");
		}
		else {
			System.out.println("This "+year+" Year is NOT LEAP year..");
		}
		
	}

}
