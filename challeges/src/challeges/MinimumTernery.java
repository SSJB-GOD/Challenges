package challeges;

import java.util.Scanner;

public class MinimumTernery {
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Minimum Number of two...!\n\n");
		System.out.print("Please, enter the first Number: ");
		int num1 = sc.nextInt();
		System.out.print("Now, enter the second Number: ");
		int num2 = sc.nextInt();
		
		MinimumTernery mini = new MinimumTernery();
		
		int result = mini.min(num1,num2);
		System.out.println("The Minimum number from two values is "+result);
		
		
	}
	
	public int min(int num1, int num2) {
		
		return  num1<num2 ? num1:num2;

		
		
	}
	

}
