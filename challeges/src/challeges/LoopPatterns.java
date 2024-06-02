package challeges;

import java.util.Scanner;

public class LoopPatterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Patterns..!");
		System.out.print("Please enter the number of rows: ");
		int row = sc.nextInt();
		 RightHalfPyramid(row);
		 ReverseRightHalf(row);
		 LeftHalfPyramid(row);
	}
	
	
	public static void LeftHalfPyramid(int num) {
		System.out.println("Left Half Pyramid...");

		int rows = num;
		while(rows > 0) {
			int j = 0;
			while(j < rows -1) {
				System.out.print("  ");
				j++;
				
			}
			int i =0 ;
			while(i <= (num -rows)) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	
	public static void ReverseRightHalf(int num) {
		System.out.println("Reverse RIght Half Pyramid...");
		int rows = num;
		
		while(rows > 0) {
			int i =0;
			while(i < rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
		
	}
	
	
	
	public static void RightHalfPyramid(int num) {
		System.out.println("Right Half Pyramid...");

		int rows = 0;
		while(rows < num) {
			System.out.print("*");
			int i =0;
			while(i < rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++;
		}
	}

}
