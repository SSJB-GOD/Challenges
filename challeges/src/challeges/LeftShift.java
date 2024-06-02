package challeges;

import java.util.Scanner;

public class LeftShift {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to showcasing LeftShit Operator");
		
		System.out.println("Please enter your Number: ");
		int num = sc.nextInt();
		
		int result = num << 1;
		System.out.println("Result of Left shit is: " + result);
	}

}
