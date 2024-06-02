package challeges;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Welcome to ODD EVEN finder..!\n\n");
	System.out.print("Please enter your number: ");
	int num = sc.nextInt();
	
	if(num%2==0) {
		System.out.println("Your number is 'EVEN'");
	}
	else {
		System.out.println("Your number is 'ODD'");
	}
	
}
}
