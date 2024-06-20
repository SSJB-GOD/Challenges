package challeges;

import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		System.out.println("Welcome to Dice roll Game .. \n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which Number will come: ");
		int num = sc.nextInt();
		Dice dice = new Dice();
		
		for(int i = 1;i<=num;i++) {
		System.out.println( dice.roll(num));
		}
		
		
	}
	
	int roll(int num) {
		double random =  Math.random() * 6;
		return (int)Math.round(Math.ceil(random));
		
	}

}
