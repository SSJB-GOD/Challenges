package challeges;

import java.util.Scanner;

public class BitwiseOR {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Welcome to BITWISE OR\n\n");
	
	System.out.print("Please enter the First Number: ");
	int num1 = sc.nextInt();
	System.out.print("Now, enter the Second Number: ");
	int num2 = sc.nextInt();
	
	int OR = num1 | num2;
	System.out.println("your bitwise OR of this number is:" +OR);
}

}
