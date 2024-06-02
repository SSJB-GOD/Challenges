package challeges;

import java.util.Scanner;

public class SumAvgOf2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Sum And Averge of 2D Array...\n\n");
		int[][] numArr = ArrayUtilites.input2DArray();
		long sum = sum(numArr);
		double avg = avg(numArr);
		System.out.println("Your Sum of 2D array is:"+sum);
		System.out.println("Your Sum of 2D array is:"+avg);

		
		
	}

	public static double avg(int[][] numArr) {
		
		// TODO Auto-generated method stub
		if(numArr.length == 0) {
			return 0;
		}	
		int rows = numArr.length;
		int cols = numArr[0].length;
		double size = rows * cols;

		return sum(numArr) / size;
	}

	public static long sum(int[][] numArr) {
		// TODO Auto-generated method stub
		int i =0;
		long sum = 0;
		while(i< numArr.length) {
			int j =0;
			while(j<numArr[i].length) {
				
				sum += numArr[i][j];
				
			 j++;
			}
		   i++;	
		}
		return sum;
	}

}
