package challeges;

import java.util.Scanner;

public class GuessGame {
	
	
	int random; 
	
	
	/**
	 * @param guessNumber the number that player guessed
	 * @return
	 * -Negative if the Guessed Number is smaller
	 * +Positive if the Guessed Number is higher
	 * 0 if the Guessed Number is correct
	 */
	
	
	
	GuessGame(){
		random = (int) Math.ceil(Math.random()* 100);
	}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to guessing Game\n");
	GuessGame Guesssing = new GuessGame();
	System.out.println("Guess the Number between  1 - 100:");
	int guess ;
	int result;
	do {
		
		System.out.println("Guess the Number:");
		guess = sc.nextInt();
		result = Guesssing.guess(guess);
		if(result == 0) {
			System.out.println("Congratates. your result is:"+result);
		}
		
	}while(result != 0);
	
}
}
