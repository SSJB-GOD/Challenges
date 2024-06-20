package challeges;

import java.util.Scanner;

public class FibonacciRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to printing Fibonacci Series ");
		System.out.println("Please, enter the number of elements to be printed.:");
		int count = sc.nextInt();
		for(int i = 1;i<=count;i++) {
			System.out.print(Fibonacci(i) + " ");
		}
	}
	public static int Fibonacci(int position) {
		if(position == 1) {
			return 0;
			
		}
		if(position == 2){
			return 1;
		}
		return Fibonacci(position - 1 ) + Fibonacci(position -2);
	}

}
