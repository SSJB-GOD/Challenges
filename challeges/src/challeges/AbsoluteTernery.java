package challeges;

import java.util.Scanner;

public class AbsoluteTernery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Absolute Ternery Program..!\n");
		System.out.print("Please, enter a Number: ");
		int num = sc.nextInt();
		
		int result = num >= 0 ? num: -num ;
		System.out.println("Absolute Value is: "+ result);
		
	}

}
