package challeges;

import java.util.Scanner;

public class BitwiseCompliment {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to bitwise Compliment\n\n");
		
		
		
		
		System.out.print("Please enter your Number: ");
		int num = sc.nextInt();
		
		int result = ~num;
		
		System.out.println("Your result Bitwise Compliment is: " + result);
		
		
		
		
	}

}
