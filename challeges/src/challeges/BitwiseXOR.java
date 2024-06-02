package challeges;

import java.util.Scanner;

public class BitwiseXOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to BITWISE XOR\n\n");
		
		System.out.print("Please enter the First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Now, enter the Second Number: ");
		int num2 = sc.nextInt();
		
		int XOR = num1  ^ num2;
		System.out.println("your bitwise XOR of this number is:" +XOR);
	}

}
