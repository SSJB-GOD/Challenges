package challeges;

import java.util.Scanner;

public class RightShift {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to showcasing RightShit Operator");
		
		System.out.println("Please enter your Number: ");
		int num = sc.nextInt();
		
		int result = num >> 1;
		System.out.println("Result of Right shit is: " + result);
	}

}
