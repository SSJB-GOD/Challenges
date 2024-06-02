package challeges;

import java.util.Scanner;

public class OddEvenTernery {
	
	public String OddEven(int num) {
		
		return num % 2 ==0 ? "Even": "Odd";
	}
	
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Odd Even Ternery...!\n\n");
	System.out.print("Please, enter a Number: ");
	int num = sc.nextInt();
	OddEvenTernery oddeven =new OddEvenTernery();
	
	String result = oddeven.OddEven(num);
	System.out.println("Your Number is: "+result);
	
	
	}

}
