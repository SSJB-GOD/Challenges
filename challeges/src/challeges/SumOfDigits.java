package challeges;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Sum of Digits Calculator/n/n/n");
		int digit = Scan();
		int sum = SumOfDigits(digit);
		System.out.println("Sum of Digits is: " + sum);
		
	}
	public static int Scan() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter a Digit: ");
		int digit = sc.nextInt();
		return digit;
	}
	public static int SumOfDigits(int digit) {
		int sum = 0;
		
		
		while(digit > 0) {
			int i = (digit % 10);
			
			/*
			 *The expression digit % 10 gives the last digit of digit.
			 * For example, if digit is 123, digit % 10 would be 3.
			 * */
			
			sum = sum + i;
			
			
			digit = digit / 10;
			/*This line removes the last digit from digit.
			 *  For example, if digit is 123, digit / 10 would be 12 
			 *  (since integer division discards the remainder).
			 */
		}
	
		
		return sum;
	}
	

}
