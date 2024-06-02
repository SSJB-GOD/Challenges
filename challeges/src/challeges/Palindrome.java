package challeges;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Welcome to Palindrome /n/n/n");
		int digit = Scan();
		boolean isPalindrome = Palindrome(digit);
		if(isPalindrome) {
			System.out.println("Your number is Palindrome");
		}
		else {
			System.out.println("Your number is not Palindrome");
		}
		
		
	}
	
	
	public static int Scan() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter a Digits: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static boolean Palindrome(int num) {
		int rev = reverse(num);
		return num == rev;
		
	}
	
	public static int  reverse(int num) {
		int rev = 0;
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;	
		}
		
		return rev;
		
	}

}
