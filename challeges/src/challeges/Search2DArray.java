package challeges;

import java.util.Scanner;

public class Search2DArray {
	public static void main(String[] args) {
		System.out.println("Welcome to 2D Search..!");
		Scanner sc = new Scanner(System.in);
		int[][] numArr= ArrayUtilites.input2DArray();
		System.out.print("Now, enter the number you want to search:");
		int num = sc.nextInt();
		boolean isFound = Search(numArr,num);
		if(isFound) {
			System.out.println("Your number was Found in Array..");
		}
		else {
			System.out.println("Your number was Not Found in Array..");
		}
		
		
	}
	public static boolean Search(int[][]numArr,int num) {
		
		int i=0;
		while(i<numArr.length) {
			int j = 0;
			while(j< numArr.length) {
				if(numArr[i][j] == num ) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
		
	}

}
