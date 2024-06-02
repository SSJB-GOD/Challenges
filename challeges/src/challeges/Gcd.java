package challeges;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		System.out.println("Welcome to GCD Finder..!\n\n");
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter First Number: ");
		int first = sc.nextInt();
		System.out.print("Now, enter Second Number: ");
		int second = sc.nextInt();
		
		int Gcd = Gcd(first,second);
		System.out.println("GCD of the two number is : " +Gcd);
	}
	public static int Gcd(int first, int second) {
		
		int gcd = 1;
		
		int i = 2;
		
		
			
			int least = least(first,second);
			while(i <= least) {
				if(first % i == 0 && second % i == 0 ) {
					gcd = i;
				}
				i++;
		}
		return gcd;
		
		
	}
	
	public static int least(int first, int second) {
		if(first < second) {
			return first;
		}
		else {
			return second;
			}	
		
	}

}
