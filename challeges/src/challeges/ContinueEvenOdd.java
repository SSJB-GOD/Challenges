package challeges;

import java.util.Scanner;

public class ContinueEvenOdd {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Continue Even and Odd");
		Scanner sc =  new Scanner(System.in);
		System.out.print("Please, Enter a Number: ");
		int num = sc.nextInt();
		
		for(int i = 1; i<= num;i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println("Even Number: "+i);
		}
	}

}
