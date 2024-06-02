package challeges;

import java.util.Scanner;

public class DoWhileNumberGuessing {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to Gussing Game\n");
		int rnd2 = (int)(Math.random()*10) + 1;
			
		int guess;
		
		
		do {
			System.out.print("Please, enter your Gussed Number: ");
			
			guess = sc.nextInt();
			System.out.println("Your guess Is: "+ guess);

		}
		while( rnd2 != guess);
		System.out.println("System's generated Number is: "+ rnd2);
		
	}
	
	

}
