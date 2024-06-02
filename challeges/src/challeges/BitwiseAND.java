package challeges;

import java.util.Scanner;

public class BitwiseAND {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to BITWISE AND\n\n");
		
		System.out.print("Please enter the First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Now, enter the Second Number: ");
		int num2 = sc.nextInt();
		
		int AND = num1 & num2;
		System.out.println("your bitwise AND of this number is:" +AND);
	}
}
