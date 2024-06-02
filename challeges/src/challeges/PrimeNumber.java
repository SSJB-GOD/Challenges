package challeges;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Welcome to Prime Number \n\n");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		int n = sc.nextInt();
		boolean prime = Prime(n);
		if(prime) {
		System.out.println("Your Number is Prime: ");
		}
		else {
			System.out.println("Your Number is Not Prime ");

		}
		
	}
	public static boolean Prime(int num) {
		int i = 2;
		while(i < num) {
			if(num%i ==0) {
				return false;
			}
			i++;
			
		}
		
		return true;
		
	}

}
