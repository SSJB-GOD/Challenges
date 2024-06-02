package challeges;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Number Checker..!\n\n");
		
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("Positive Number:" + num);
			
		}
		else if(num == 0) {
			System.out.println("Number is Zero:" + num);
		}
		else if(num < 0) {
			System.out.println("Negative Number: " + num);
			
		}
	}

}
