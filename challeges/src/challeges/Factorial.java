package challeges;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Welcome to Factorial ");
		int num = Scan();
		long fact = fact(num);
		System.out.println("Factorial of this Number is : "+fact);
		

		
	}
	
	public static int Scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number to find Factorial of: ");
		int num = sc.nextInt();
		return num;
	}
	public static long fact(int num) {
		if(num<2) {
			return 1;
		}
		long fact = 1;
		int i = 2;
		while(i<=num) {
			fact = fact * i;
			i++;
		}
		return  fact;
	}

}
