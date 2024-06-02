package challeges;

import java.util.Scanner;

public class FibonanciSeries {
	public static void main(String[] args) {
		System.out.println("Welcome to Fibonacci Series");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("your fibonancci Series  is: ");
		Fibonan(num);
		
		
		
	}

	public static void Fibonan(int num) {
		// TODO Auto-generated method 
		
		if(num < 0) return ;
		System.out.print("0 ");
		
		if(num == 0)return;
		System.out.print("1 ");
		
		int first = 0, second = 1;
		
		while(first + second <= num) {
			 int digit = first + second ;
			 System.out.print( digit +" ");
			 first = second;
			 second = digit;
		}
		
	}

}
