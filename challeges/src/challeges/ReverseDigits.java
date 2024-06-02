package challeges;

import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		System.out.println("Welcome to Reverse the Digit/n/n/n");
		int digit = Scan();
		int sum = Reverse(digit);
		System.out.println("Reverse Number is  :   " + sum);
		
	}
	
	
	public static int Scan() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter a Digits: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int Reverse(int num) {
		int rev = 0;
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
			
		}
		
		return rev;
		
	}

}
