package challeges;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Max and Min finder...!\n\n");
		
		int[] numArr = ArrayUtilites.inputArray();
		int max = Max(numArr);
		int min = Min(numArr);
		System.out.println("Maximum element of this array is: "+ max);
		System.out.println("Minimum element of this array is: "+ min);
		
	}
	public static int Max(int[] numArr) {
		if(numArr.length == 0) {
			return Integer.MIN_VALUE;
		}
		
		int max = numArr[0];
		int i =1;
		while(i < numArr.length) {
			
			if(numArr[i] > max) {
				max = numArr[i];
			}
			i++;
			
		}
		
		return max;
	}
	
	public static int Min(int[] numArr) {
		int min = Integer.MAX_VALUE;
		int i =0;
		while(i < numArr.length) {
			if(numArr[i]< min) {
				min = numArr[i];
			}
			
			i++;
		}
		
		return min;
	}
}
