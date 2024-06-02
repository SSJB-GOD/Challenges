package challeges;

import java.util.Scanner;

public class ForPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to prime number Checker..!\n");
		System.out.print("Please, enter the number: ");
		int num = sc.nextInt();
		boolean isPrime = isPrime(num) ;
		System.out.println("Your Number is  "+(isPrime(num)?"Prime":"Not Prime"));
		
	}
	public static boolean isPrime(int num) {
		for(int i = 2; i < num;i++) {
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
	}

}
