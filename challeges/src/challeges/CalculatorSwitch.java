package challeges;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Please, enter first number:");
		int num1 = sc.nextInt();
		System.out.print("Please, enter second number:");
		int num2 = sc.nextInt();
		
		System.out.print("Please enter your Operation: ");
		String operation = sc.next();
		
		int result = switch(operation) {
		case "+" -> num1 + num2;
		case "-" -> num1 - num2;
		case "*" -> num1 * num2;
		case "/" -> num1 / num2;
		case "%" -> num1 % num2;
		default -> -100000000;
	};
	
	System.out.println(" firstNum " + operation + " secondNum = "+ result);
		
	}	
}
		
