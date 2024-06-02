package challeges;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numArr = ArrayUtilites.inputArray();
		
		Reverse(numArr);
		System.out.println("Your Reverse Array is");
		ArrayUtilites.displayArray(numArr);

	}

	public static void Reverse(int[] numArr) {
		int i=0;
		while(i < numArr.length / 2) {
			int swap = numArr[i];
			
			numArr[i]= numArr[(numArr.length -1 ) - i];
			
			           numArr[(numArr.length -1 ) - i] = swap;
			
			i++;
		}
		
		
	}
}
