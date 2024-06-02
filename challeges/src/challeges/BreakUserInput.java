package challeges;

import java.util.Scanner;

public class BreakUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Break User Input System.");
		
	
		while(true) {
			System.out.print("Please, enter any  command: ");
			String command = sc.next();
			if(command.equalsIgnoreCase("exit")) {
				break;
			}
			
		}
		System.out.println("Your out of Program");
		
		
	}

}
