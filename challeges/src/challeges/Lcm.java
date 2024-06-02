package challeges;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		System.out.println("Welcome to LCM Finder..!\n\n");
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter First Number: ");
		int first = sc.nextInt();
		System.out.print("Now, enter Second Number: ");
		int second = sc.nextInt();
		
		int lcm = lcm(first,second);
		System.out.println("LCM of the two number is : " +lcm);
		
		
	}
	
	public static int lcm(int first, int second) {
		
		int i = 1;
		while(i <= second)  //also i can change this condition to true because return value is inside if so compiler never reach to last return 
			//for that i can make this loop true .
			{
			int factor = (first * i);
			if(factor % second == 0) {
				return factor;
			}
			i++;
			
		}
		
		
		return 0; //unreachable
	}

}
