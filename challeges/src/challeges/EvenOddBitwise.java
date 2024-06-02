package challeges;

import java.util.Scanner;

public class EvenOddBitwise {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			System.out.println("Welcome to showcasing LeftShit Operator");
			
			System.out.println("Please enter your Number: ");
			int num = sc.nextInt();
			
			if((num & 1) == 1) {
				
				System.out.println("Your Number is Even"+ num);
				
			}
			else {
				System.out.println("Your Number is Odd"+ num);
			}
		
	}

}
