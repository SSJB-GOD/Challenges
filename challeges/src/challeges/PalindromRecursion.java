package challeges;

import java.util.Scanner;

public class PalindromRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker..!");
		System.out.println("Please, enter the String.:");
		String str =sc.next();
		System.out.println("Your String is "+((isPalindrome(str) ? "Palindrome"
				 												:"Not Palindrome")));
		
		
		
	}
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		int lastPostion = str.length() - 1;
		if(str.charAt(0) != str.charAt(lastPostion)) {
			return false;
		}
		String Newstr = str.substring(1,lastPostion);
		return isPalindrome(Newstr); 
	}

}
